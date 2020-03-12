package com.stx.exercise.p9.Three_LiMin;

public class ShapDemo {

    public void getShapArea(Shap shap){

        System.out.println(shap.getArea());

    }
    public static void main(String[] args) {
        ShapDemo shapDemo = new ShapDemo();
        System.out.print("半径是 1.0 的圆形面积大约是：");
        shapDemo.getShapArea(new Cycle(1.0));
        System.out.print("高3.0，宽 5.0 的矩形面积是：");
        shapDemo.getShapArea(new Rectangle(3.0,5.0));
    }
}
