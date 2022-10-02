package com.demo.threads.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        //It has a thread pool that will execute the tasks and reuse the threads for further tasks after executing one task
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task(i));
        }
    }
}
