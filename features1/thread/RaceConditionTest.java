package com.ak.java.thread;

public class RaceConditionTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(()-> {
            int x=0;
            for(int i=0; i<10000; i++){
                x = counter.increment();
            }
            System.out.println("My name is : "+Thread.currentThread().getName()+" And Value is :"+x);
        },"Sheela1");
        Thread t2 = new Thread(()-> {
            int x=0;
            for(int i=0; i<10000; i++){
                x = counter.increment();
            }

            System.out.println("My name is : "+Thread.currentThread().getName()+" And Value is :"+x);
        },"Sheela2");

        t1.start();
        t2.start();
    }

}


