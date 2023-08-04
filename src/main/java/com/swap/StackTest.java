package com.swap;

import java.util.List;


public class StackTest {


    public static void main(String[] args) {
        Stack lst = new Stack(10);
        lst.push(12);
        lst.push(18);
        lst.push(10);
        lst.push(1);
        lst.push(2);

        System.out.println("removing ele ");
        System.out.println("removed : " + lst.pop());
        int i = 1;
        for (Object num : lst) {
            System.out.println("ele" + i + ": " + num);
        }
//        for (int j = 0; j < 10 ; j++) {
//            System.out.println("ele" + i + ": " + j);
//            i++;
//        }
    }
}

