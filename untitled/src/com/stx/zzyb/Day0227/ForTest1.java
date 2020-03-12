package com.stx.zzyb.Day0227;

public class ForTest1 {
    /*需求：用for 循环打印一张99 乘法表
      思路：1，实现倒三角形模型
            2，实现自动乘法输出
       步骤：
       1，嵌套for循环
       2，内循环输出每一个乘法等式
     */
    public static void main(String[] args) {
        for (int i =9; i > 0 ; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(i + "×" + j + " = " + (i*j) + " ");
            }
            System.out.println();
        }
    }
}
