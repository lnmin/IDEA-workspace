package com.stx.zzyb.Day0303;

import static java.util.Arrays.binarySearch;

public class TestBinarrySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,9,12,14,16,25,46};
        System.out.println(binarySearch(arr,6));  //binarySearch(arr,6)=(-(插入点)-1)
    }
}
