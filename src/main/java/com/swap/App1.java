package com.swap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App1 {
    Random random = new Random();
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private List list1 = new ArrayList<Integer>();
    private List list2 = new ArrayList<Integer>();

    private void stageOne() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt());
        }
    }

    private void stageTwo() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt());
        }
    }

    private void process() {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void main() {
        System.out.println("process started");
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("process ends in " + (end - start));
        System.out.println("list1 size is: " + list1.size() + " list1 size is: " + list2.size());
    }
}
