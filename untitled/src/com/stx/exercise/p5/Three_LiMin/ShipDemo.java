package com.stx.exercise.p5.Three_LiMin;

public class ShipDemo {
    public static void main(String[] args) {
        Ship ms = new Ship();    //创建一个Ship对象,将之赋给ms变量
        ms.setName("Merlin");
        ms.paddle();

        Ship ss = new Ship();   //创建一个Ship对象,将之赋给ss变量
        ss.setName("Sunny ");
        ss.paddle();
    }
}
