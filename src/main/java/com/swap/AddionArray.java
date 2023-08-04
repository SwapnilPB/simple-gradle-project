package com.swap;

import java.util.Arrays;

public class AddionArray {

    public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]) == target) {
                        return new int[]{i, j};
                    }
                }
            }
        return null;
    }

    public static void main(String[] args) {
        AddionArray aa = new AddionArray();
        int a[] = new int[]{1, 1, 2};
        int res[] = aa.twoSum(a, 3);
        System.out.println("res : " + res);
    }
}