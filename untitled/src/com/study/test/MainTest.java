package com.study.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        try {
            //1，创建sax读取对象
            SAXReader reader = new SAXReader();  //jdbc  -- classloader
            //2.指定解析的xml源
            Document document = reader.read(new File("untitled/src/com/study/xml/demo.xml"));

            //3.得到元素
            //得到根元素
            Element rootElement = document.getRootElement();
            //得到孙元素的文本
//            System.out.println(rootElement.element("stu").element("age").getText());


       /*     //获取根元素下的所有子元素 stu元素
            List<Element> elements = rootElement.elements();
            //遍历所有的stu元素
            for (Element element: elements) {
                //获取stu元素下面的name元素
                System.out.println(element.element("name").getText());
                System.out.println(element.element("age").getText());

            }
            */

            //要想使用Xpath， 还得添加支持的jar  获取的是第一个 只返回一个
            Element nameElement = (Element) rootElement.selectSingleNode("//name");
            System.out.println(nameElement.getText());
            //获取文档里面所有 name的元素
            List<Element> list = rootElement.selectNodes("//name");
            for (Element element :
                    list) {
                System.out.println(element.getText());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
