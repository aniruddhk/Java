package com.ak.java.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomExecutor {

    LinkedBlockingQueue<Runnable> blockingQueue = null;
    Thread thread[];
    private static int max_threads=10;
    int counter=0;

    public CustomExecutor(){
        this(max_threads);
    }
    public CustomExecutor(int n){
        blockingQueue = new LinkedBlockingQueue();
        thread = new Thread[n];
        max_threads = n;
        for(int i=0; i<max_threads; i++){
            thread[i] = new Thread();
        }

    }

    public static CustomExecutor fixedCustomExecutor(int i) {
        return new CustomExecutor(i);
    }

    public void execute(Runnable runnable) throws InterruptedException {
        blockingQueue.add(runnable);
        while(true){
            if(thread.length==counter){
                blockingQueue.wait();
            }
            blockingQueue.poll().run();
        }

    }
}
