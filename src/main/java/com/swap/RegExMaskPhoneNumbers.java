package com.swap;

public class RegExMaskPhoneNumbers {

    public static void main(String[] args) {

        String[] strPhoneNumbers = {
                "12344",
                "0123456789",
                "911234567890"
        };

        String strPattern = "\\d(?=\\d{3})";

        for(String phoneNumber : strPhoneNumbers) {
            System.out.println( phoneNumber.replaceAll(strPattern, "*") );
        }
    }
}