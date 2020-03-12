package com.stx.exercise.p9.Three_LiMin;

public class Rectangle extends Shap{
    private double length;
    private double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public double getArea() {
        return length*wide;
    }
}
