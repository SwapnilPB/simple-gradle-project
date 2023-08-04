package com.swap.model;

import java.math.BigDecimal;

public class CfgScale {
    public static void main(String[] args)
    {
        BigDecimal res;
        String input1 = "31452678569.5";
        BigDecimal a = new BigDecimal(input1);
        res = a.setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println(res);
    }
}