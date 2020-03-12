package com.stx.exercise.p9.Three_LiMin;

public class Cycle extends Shap {
    final static double PI = 3.14;
    private double r;

    public Cycle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI*r*r;
    }
}
