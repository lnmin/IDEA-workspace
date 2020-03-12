package com.stx.zzyb.Day0302;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,6,1,64,75,84,2,15,77,90};
        bubbleSort(arr);
        print(arr);
     }
    /**
     *
     */
    public static void bubbleSort(int[] arr){
        for (int i =0; i < arr.length-1; i++){    //外循环只需要比较arr.length-1就可以了
            for (int j =0; j < arr.length -1 -i; j++){   //-1 为了防止索引越界 ,-i为了提高效率
                if (arr[i] > arr[j+1]) {
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    public static void print(int[] arr){
        for (int i=0 ;i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
