package com.stx;

class Fruite{
    public double weight;
    public void info(){
        System.out.println("我是一个水果，重" + weight + "kg!");
    }
}
public class Apple extends Fruite{
    public static void main(String[] args) {
        //创建Apple对象
        Apple a = new Apple();
        //Apple对象本身没有weight成员变量
        //因为Apple的父类有weight成员变量，所以可以访问Apple对象的weight成员变量
        a.weight = 100;
        // 控制台显示：我是一个水果，重100.0kg!
        a.info();
    }
}

