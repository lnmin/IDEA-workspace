package com.stx.exercise.p3;

public class Three_LiMin {
    public static void main(String[] args) {
        String s = new String("want you to know one thing");
        char[] arr =s.toCharArray();
        int sumN=0;
        int sumO=0;
        for(char c : arr){
            if ('n' == c){     //使用 == 判断，如果两个变量是基本类型变量，只要两个变量的值相等，就返回true
                sumN += 1;
            }else if('o' == c){
                sumO += 1;
            }
        }
        System.out.println("有"+ sumN+ "个n");
        System.out.println("有"+ sumO+ "个o");
    }
}
