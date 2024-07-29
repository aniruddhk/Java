package com.ak.java.thread;

public class CustomExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        CustomExecutor executor = CustomExecutor.fixedCustomExecutor(10);
        Runnable runnable = ()->{
            System.out.println("Test");
        };
        executor.execute(runnable);
    }
}
