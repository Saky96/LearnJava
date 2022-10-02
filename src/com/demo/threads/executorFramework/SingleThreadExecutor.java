package com.demo.threads.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
    int id;
    Task(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("TaskId: "+ id + ", ThreadId: " + Thread.currentThread().getId());
        long duration = (long) Math.random()*5;

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

public class SingleThreadExecutor {
    public static void main(String[] args) {
        //It is a single thread that will execute the tasks sequentially i.e. is one by one
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task(i));
        }

        executorService.shutdown();
    }
}
