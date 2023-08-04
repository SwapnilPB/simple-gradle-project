package com.swap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Task is completed: "+i);
        }
    }
}
public class App2 {
ExecutorService service = Executors.newFixedThreadPool(2);

    public void setService(ExecutorService service) {
        this.service = service;
    }
}
