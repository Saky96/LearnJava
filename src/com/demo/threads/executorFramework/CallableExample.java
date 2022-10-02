package com.demo.threads.executorFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Processor implements Callable<String>{

    int id;

    Processor(int id){
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Id: "+this.id;
    }
}

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<String>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
           Future<String> futureObject = executorService.submit(new Processor(i+1));
           futureList.add(futureObject);
        }

        for(var ele: futureList){
            System.out.println(ele.get());
        }

        executorService.shutdown();
    }
}
