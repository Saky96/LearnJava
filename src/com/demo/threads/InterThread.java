package com.demo.threads;

class Process{

    public void produce() throws InterruptedException{
        synchronized (this){
            System.out.println("Running Produce...");
            wait();
            System.out.println("Resuming Produce...");
        }
    }

    public void consume() throws InterruptedException{
        Thread.sleep(1000);
        synchronized (this) {
            System.out.println("Running Consume...");
            notify();
            Thread.sleep(2000);
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        Process process = new Process();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
