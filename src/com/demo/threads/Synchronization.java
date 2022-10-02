package com.demo.threads;

public class Synchronization {

    static int counter = 0;

//    static synchronized void incrementer(){
    static  void incrementer(){

        synchronized(Synchronization.class){
            counter++;
        }
    }
    static void process() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                counter++;
                incrementer();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
//                    counter++;
                    incrementer();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Counter value after t1 and t2 have completed is: "+ counter);
    }

    public static void main(String[] args) {
        process();
    }
}
