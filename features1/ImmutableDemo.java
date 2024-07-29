package com.ak.java;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo {

    private final int age;
    private final String name;
    private final Map<Integer,String> addresses = new HashMap<>();


    public ImmutableDemo(int age, String name, Map<Integer, String> addresses) {
        this.age = age;
        this.name = name;

        for(Integer i : addresses.keySet()){
            this.addresses.put(i,addresses.get(i));
        }
    }
}
