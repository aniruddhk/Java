package com.ak.java;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,5);
        int m=-1;
        Optional<Integer> max = list.stream().max(Comparator.comparing(Integer::valueOf));
        if(max.isPresent()){
            m=max.get();
        }
        list.stream().map(a-> {

        return 0;
        });
    }
}
