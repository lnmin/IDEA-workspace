package com.stx.exercise.p2;

import java.util.Scanner;

public class Three_LiMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小组人数：");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        input(arr);  //键入每个人的分数
        selectSort(arr);  //排序
        print(arr);   //打印排序好的分数
        double averageNumber = average(arr);
        System.out.println("该小组的平均分：" + averageNumber);


    }

    public static void input(double[] arr){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入第"+ (i+1) +"个人的分数");
            double temp = scanner.nextDouble();
            arr[i] = temp;
        }
    }


    public static void selectSort(double[] arr){
        for (int i =0; i < arr.length -1; i++){
            for (int j =i+1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void print(double[] arr){
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static double average(double[] arr){
        double sum = 0.0;
        for (int i= 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
