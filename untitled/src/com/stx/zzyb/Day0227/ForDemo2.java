package com.stx.zzyb.Day0227;

public class ForDemo2 {
    public static void main(String[] args) {
//        for (int i = 1  ; i < 10 ; i++){
//            if (i%2 == 0){
//                continue;
//            }
//                System.out.println(i);
//        }
        
        for (int i = 0 ; i<5; i ++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
