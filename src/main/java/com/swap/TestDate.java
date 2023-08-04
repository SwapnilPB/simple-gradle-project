package com.swap;

import java.util.Date;

public class TestDate{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("date -"+ new Date());

        Thread.sleep(6000);

        System.out.println("date -"+ new Date());
    }
}