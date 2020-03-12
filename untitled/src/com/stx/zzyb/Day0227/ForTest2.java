package com.stx.zzyb.Day0227;

public class ForTest2 {
    /*需求：用3种循环结构计算出1 到10 相加的和。
     */
    public static void main(String[] args) {
       forSum(10);
       whileSum(10);
       doWhileSum(10);
    }
    public static void forSum(int s){
        int sum = 0;
        for (int i =1 ; i< 11; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void whileSum(int s){
        int i =1;
        int sum = 0;
        while (i < 11){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
    public static void doWhileSum(int s){
        int i =1;
        int sum =0;
        do {
            sum += i;
            i++;
        }while (i < 11);
        System.out.println(sum);
    }
}
