import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class FiltersTest {
    public static void main(String[] args) {

        List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> integerStream = list.stream().filter(i -> {
            return i % 2 == 0;
        });
        integerStream.forEach(System.out::println);


    }
}
