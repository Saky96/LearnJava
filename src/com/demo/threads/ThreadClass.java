package com.demo.threads;

class Runner1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1: "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Runner2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread2: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadClass {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runner1());

        Thread t2 = new Thread(new Runner2());

        try {
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t1.start();
        t2.start();
    }
}
