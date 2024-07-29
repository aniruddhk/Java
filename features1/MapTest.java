import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        Function<Integer,Integer> testOne = a ->a*a;
        List<Integer> list1  = list.stream().map(testOne).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);
    }
}
