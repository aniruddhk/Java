package JavaFeatures;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MinHeapWindowDeque {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(7);

        ArrayList<Integer> result = new ArrayList<>();
        int k=3;
        
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            
            while(!deque.isEmpty() && list.get(i)>=list.get(deque.peekLast())){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for(int i=k; i<list.size(); i++){
            result.add(deque.peek());
            while ((!deque.isEmpty()) && deque.peek() <=
                                             i - k)
                                             deque.removeFirst();
 
        
            while ((!deque.isEmpty()) && list.get(i) >=
                              list.get(deque.peekLast()))
                              deque.removeLast();
 
            
            deque.addLast(i);
        }
        result.add(deque.peek());
        System.out.println(result);
        
        
    }
    
}
