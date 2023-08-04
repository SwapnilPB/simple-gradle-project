package com.swap;

public class PassByValue {
    public static void main(String[] args) {
        int a = 9;
        int b =12;
        System.out.println("========Before calling swap from main method============");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("========end of Before calling swap from  main method============");

        swap(a,b);
        System.out.println("========from main method============");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("========end of main method============");
    }
    static void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("========from swap method============");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("========end of swap method============");
    }
}
