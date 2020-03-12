package com.stx.zzyb.Day0227;

public class ForTest3 {
    /*需求：打印1-50 的数字，当是7的倍数时不输出。
      分析: 1，遍历打印1-50的所有数字
            2，判断是7的倍数，不输出
       步骤：
       1，for遍历
       2，if判断，当是7的倍数时，continue
     */
    public static void main(String[] args) {
        for (int i = 1; i < 51; i++){
            if (i % 7 ==0){
                System.out.println();
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
