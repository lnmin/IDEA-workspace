package com.stx.zzyb.Day0227;

public class ForTest8 {
    public static int sum(int n){
        if (n ==1){
            return n;
        }else {
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
