package com.swap;

import java.math.BigDecimal;

public class BigDeciTest {
    public static void main(String[] args) {
        BigDecimal db = new BigDecimal(1);
        double dd = db.doubleValue();

        System.out.println("dd : "+dd);
        double v = dd * 100;
        String a = String.valueOf(v);

        System.out.println("a : "+a);

    }
}
