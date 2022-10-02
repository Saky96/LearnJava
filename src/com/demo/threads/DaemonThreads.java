package com.demo.threads;

class DaemonWorker implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread working");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class NormalWorker implements Runnable {

    @Override
    public void run() {

        System.out.println("Normal thread starts");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Normal thread finishes...");


    }
}

public class DaemonThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DaemonWorker());
        Thread t2 = new Thread(new NormalWorker());

        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
