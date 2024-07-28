package JavaFeatures;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RaceCondtionRMW {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);

        System.out.println(set.contains(10) );
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
            System.out.println("Thread t1 : "+ counter.increment(1));

        });
        Thread t2 = new Thread(()->{
            System.out.println("Thread t2 "+counter.increment(-2));

        });
        Thread t3 = new Thread(()->{
            System.out.println("Thread t3 "+counter.increment(3));

        });

        t1.start();
        t2.start();
        t3.start();


    }
}
