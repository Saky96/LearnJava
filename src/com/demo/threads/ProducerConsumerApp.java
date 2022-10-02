package com.demo.threads;

import java.util.ArrayList;
import java.util.List;

class Processor{

    final int UPPER_LIMIT = 5;
    final int LOWER_LIMIT = 0;

    int value = 0;
    List<Integer> list = new ArrayList<>();
    final Object lock = new Object();

    void producer() throws InterruptedException{
        synchronized (lock){
            while (true){
                if(list.size() == UPPER_LIMIT){
                    System.out.println("Waiting for removing elements...");
                    lock.wait();
                }
                else {
                    System.out.println("Adding: "+ value);
                    list.add(value);
                    value++;
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    void consumer() throws InterruptedException{
        synchronized (lock){
            while (true){
                if (list.size() == LOWER_LIMIT){
                    System.out.println("Waiting to add values...");
                    value = 0;
                    lock.wait();
                }
                else {
                    System.out.println("Removing: "+ list.remove(list.size() - 1));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}

public class ProducerConsumerApp {
    public static void main(String[] args) {

        Processor processor = new Processor();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
