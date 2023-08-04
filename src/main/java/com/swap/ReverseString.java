package com.swap;

public class ReverseString {
    public static void main(String[] args) {
        String rev= revString("euhf");
        System.out.println("rev is "+rev);

    }
    static String revString(String st){
        String rev ="";
        for (int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            rev=ch+rev;
        }
        return rev;
    }
}
