import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        BinaryOperator<Integer> prod = (x,y) ->{
            Integer z= x*y;
            System.out.println(x+" * "+y+" = "+z);
            return z;
        };
        Optional<Integer> reduce = list.stream().reduce((a, b) -> a + b);
        if(reduce.isPresent()){
            System.out.println(reduce.get());
        }

        Optional<Integer> reduce1 = list.parallelStream().reduce(prod);
        if(reduce.isPresent()){
            System.out.println(reduce.get());
        }

    }
}
