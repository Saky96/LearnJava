package com.demo.threads;

public class Tester {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner1());

        Thread t2 = new Thread(new Runner2());

        var mainThreadName = Thread.currentThread().getName();
        System.out.println(mainThreadName);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("threads finished execution");
    }
}
