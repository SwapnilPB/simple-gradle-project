package com.swap;



import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("date : "+d);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        System.out.println("first formatted date : "+dateFormat.format(d));
        System.out.println("second formatted date : "+sdf.format(d));
    }

}
