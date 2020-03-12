package com.stx.zzyb.Day0302;

public class ArrayMaxMinDemo {
    public static void main(String[] args) {


    }

    /**
     *
     * @param a
     * @return
     */
     public static int getMax(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length ; i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
     }


}
