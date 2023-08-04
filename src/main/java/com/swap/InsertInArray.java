package com.swap;

import java.util.HashMap;
import java.util.Map;

public class InsertInArray {
    public static void main(String[] args) {
        String a[] = new String[6];
        Map<String, String> data = new HashMap<>();
        data.put("A", "Z");
        data.put("B", "Y");
        data.put("C", "X");
        data.put("D", "W");
        data.put("E", "V");
        data.put("F", "U");
        int i = 0;
            for (Map.Entry me : data.entrySet()) {
                System.out.println("Before i : "+i);
                a[i] = me.getKey() + " " + me.getValue();
                i++;
                System.out.println("after i : "+i);
        }
        for (String ar : a) {
            System.out.println(ar);
        }
    }
}
