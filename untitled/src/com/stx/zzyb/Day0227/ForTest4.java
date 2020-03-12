package com.stx.zzyb.Day0227;

public class ForTest4 {
    /*需求：打印出100~1000范围内的所有 “水仙花数”，所谓“水仙花数”是指一个三位数，
            其各位数字立方和等于该数本身。例如：153是一个“水仙花数”，
            因为153=1的三次方＋5的三次方＋3的三次方
      分析:１，遍历打印100~1000范围内的所有数
           2,抽取一个将各位数字立方和返回的方法
           3，判断是否是“水仙花数”
           4，如果是打印出来
      步骤：
      1，for遍历
      2，判断是否是“水仙花数”，如果是输出
     */
    public static void main(String[] args) {
        for (int i =100; i < 1000; i++){
            if (i == cubeSum(i)){
                System.out.println(i);
            }
        }

    }
    public static int cubeSum(int i){
        return (i/100)*(i/100)*(i/100) +
                (i/10%10)*(i/10%10)*(i/10%10) +
                (i%10)*(i%10)*(i%10);
    }
}
