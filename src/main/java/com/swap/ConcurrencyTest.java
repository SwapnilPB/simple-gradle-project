package com.swap;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ConcurrencyTest {
    public static void main(String[] args) {
        List ls = new LinkedList<String>();
        ls.add("as");
        ls.add("bs");
        ls.add("fc");
        Iterator it = ls.iterator();

        System.out.println("first");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ls.add("fd");
        Iterator it1 = ls.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
