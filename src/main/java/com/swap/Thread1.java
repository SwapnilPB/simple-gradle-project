package com.swap;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("I am in Thread 1 run");
        Thread2 t2 = new Thread2();
        t2.run();
        try {
            System.out.println("** name 1 *** "+Thread.currentThread().getName());
            System.out.println("waiting to current Thread 1 ");
            System.out.println("** name 1 *** "+Thread.currentThread().getName());
            Thread.currentThread().wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("** name T1 *** "+Thread.currentThread().getName());
        System.out.println("** notifying *** "+Thread.currentThread().getName());
        t2.notify();
        System.out.println("** after notifying *** "+Thread.currentThread().getName());
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("** name T1 *** "+Thread.currentThread().getName());
        System.out.println("I am in Thread 2 run");
    }
}


class Main{
    public static void main(String[] args) {
        System.out.println("** name Main *** "+Thread.currentThread().getName());
        Thread1 t = new Thread1();
        t.run();
    }
}