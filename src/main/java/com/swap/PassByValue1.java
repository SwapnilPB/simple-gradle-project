package com.swap;

import java.util.Arrays;

public class PassByValue1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 11;
        int[] arr = {10, 45, 23, 54, a, b};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int nums[]) {
        nums[4] = 11;
        nums[5] = 9;
    }
}
