package JavaFeatures;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count=new AtomicInteger(0);
    public int increment(int val){

        count.set(count.get()+val);
        return count.get();


    }
}
