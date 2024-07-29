import java.util.Map;
import java.util.function.Function;

public class LamdaExpressionDemo1 {
    int x1=10;
    public static void main(String[] args) {
        Function<Integer,Integer> temp = x->x+10;
        System.out.println(temp.apply(10));



    }



}
