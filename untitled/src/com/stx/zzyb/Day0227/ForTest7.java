package com.stx.zzyb.Day0227;

public class ForTest7 {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(3.8,4.2));
        System.out.println(add(3,4,1));
    }
    public static int add(int x, int y){
        return x+y;
    }
    public static int add(int x, int y, int z){
        return x+y+z;
    }
    public static double add(double x, double y){
        return x+y;
    }
}
