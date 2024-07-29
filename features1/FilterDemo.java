import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> list1 = list.stream().filter(a-> a%2==0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);
    }
}
