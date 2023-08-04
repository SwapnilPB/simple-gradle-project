package com.swap;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class RemoveNull {
    public static void main(String[] args) {
        Date[] d = {null, new Date()};
        System.out.println("array : " + Arrays.toString(d));
        d = Arrays.stream(d).filter(Objects::nonNull).toArray(Date[]::new);
        System.out.println("array : " + Arrays.toString(d));
    }
}
