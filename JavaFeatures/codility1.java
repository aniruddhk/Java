package JavaFeatures;

import java.util.*;
public class codility1 {
    public int solution(int[] A) {
        int count=0;
        int i = 0;
        Set<Integer> set = new HashSet<>();
        for(int j=1; j<A.length; j++){
            int sum = A[i]+A[j];
            if(sum%2==0 && !set.contains(j) && !set.contains(i)){
                set.add(j);
                set.add(i);
                count++;
            }
            i=j;
        }
        if((A[0]+A[A.length-1])%2==0 && !set.contains(0) && !set.contains(A.length-1)) 
            count++;
        return count;

    }
    public static void main(String args[]){
        codility1 code = new codility1();
        int a[]={4, 2, 5, 8, 7, 3, 7};
        System.out.println("Count : "+code.solution(a));

    }
    
}
