package com.demo.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockWorker {

    final int UPPER_LIMIT = 5;
    final int LOWER_LIMIT = 0;

    int value = 0;
    List<Integer> list = new ArrayList<>();
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    void producer() throws InterruptedException {
        while (true) {
            lock.lock();
            if (list.size() == UPPER_LIMIT) {
                System.out.println("Waiting for removing elements...");
//                lock.wait();
                condition.await();
            } else {
                System.out.println("Adding: " + value);
                list.add(value);
                value++;
//                lock.notify();
                condition.signal();
            }
            Thread.sleep(500);
            lock.unlock();
        }
    }

    void consumer() throws InterruptedException {
        while (true) {
            lock.lock();
            if (list.size() == LOWER_LIMIT) {
                System.out.println("Waiting to add values...");
                value = 0;
//                lock.wait();
                condition.await();
            } else {
                System.out.println("Removing: " + list.remove(list.size() - 1));
//                lock.notify();
                condition.signal();
            }
            Thread.sleep(500);
            lock.unlock();
        }

    }
}

public class ReEnterantLockApp {
    public static void main(String[] args) {
        LockWorker lockWorker = new LockWorker();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lockWorker.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lockWorker.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
