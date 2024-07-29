package com.ak.java.thread;

public class StaticCounter {
    private int count=0;
    private static int sCount=0;
    synchronized public void incWoStatic(){
        count++;

    }
    synchronized static public void incWStatic(){
        sCount++;
    }
}
