package com.stx.zzyb.Day0227;

public class ForTest5 {
    /*需求：用 * 打出直角三角形，和倒三角形
      分析:1，for嵌套实现
     */
    public static void main(String[] args) {

        zTriangle();
        System.out.println();
        fTriangle();
    }
    public static void zTriangle(){
        for (int i=0; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fTriangle(){
        for (int i=5; i>0; i--){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
