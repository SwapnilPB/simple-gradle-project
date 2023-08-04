package com.swap;

public class RomanToInt {
    public static void main(String[] args) {
int res = new RomanToInt().romanToInt("XI");
        System.out.println("res : "+res);
    }

    public int romanToInt(String s) {
        int sum = 0;
        char[] ca = s.toCharArray();
        int len = ca.length;
        for (int i = 0; i < len; i++) {
            if (i < (len - 1) && romanCharToInt(ca[i]) < romanCharToInt(ca[i + 1])) {
                sum -= romanCharToInt(ca[i]);
            } else {
                sum += romanCharToInt(ca[i]);
            }
        }
        return sum;
    }

    public int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }


    }
}
