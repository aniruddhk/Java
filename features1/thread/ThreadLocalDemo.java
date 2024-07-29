package com.ak.java.thread;

public class ThreadLocalDemo {
    public static void main(String[] args) {


        Runnable runnable = ()->{
            ThreadLocal threadLocal = new ThreadLocal();
            threadLocal.set(Math.random());

        };
        Thread t1 = new Thread(runnable);

        Thread t2 = new Thread(runnable);



    }


}
