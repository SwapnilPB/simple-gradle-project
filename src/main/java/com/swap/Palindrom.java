package com.swap;

public class Palindrom {

    public boolean isPalindrome(int x) {
        //String s = String.valueOf(x);
        //x=121;
        if (x < 0) {
            return false;
        }

        int a = x;
        int b = 0;
        int c = 0;
        while (a != 0) {
            b = a % 10;
            a = a / 10;
            c = (c * 10) + b;
        }

        if (x == c) {
            return true;
        } else
            return false;

//        int c;
//        int d;
//
//        b = a % 10;//last digit
//        System.out.println("last digit : " + b);
//
//        a = a / 10;//remove last digit
//        System.out.println("removed last digit : " + a);
//
//        c = a % 10;//last digit
//        System.out.println("last digit -1 : " + c);
//
//        a = a / 10;//remove last digit
//        System.out.println("remove last digit -1 : " + a);
//
//        d = a % 10;//last digit
//        System.out.println("last digit -2 : " + d);
//
//        a = a / 10;//remove last digit
//        System.out.println("remove last digit -2 : " + a);
    }

    public static void main(String[] args) {
        System.out.println("res : " + new Palindrom().isPalindrome(-1221));
    }
}
