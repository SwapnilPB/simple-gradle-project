package com.swap;

public class RemoveLeadingZero {
    public static void main(String[] args) {
        String a = "11110000";
        Long l = Long.parseLong(a.replaceAll("^0+", ""));
        System.out.println("a  :   "+a);
        System.out.println("l  :   "+l);
    }
}
