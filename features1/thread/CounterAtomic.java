package com.ak.java.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic {
    private AtomicInteger count;
    CounterAtomic(){
        count = new AtomicInteger(0);
    }

    public int increment(){

        return count.incrementAndGet();
    }
}
