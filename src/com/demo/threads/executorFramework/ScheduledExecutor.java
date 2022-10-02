package com.demo.threads.executorFramework;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        for (int i = 0; i < 10; i++) {
            executorService.scheduleAtFixedRate(new Task(i), 1000, 2000, TimeUnit.MILLISECONDS);
        }
    }
}
