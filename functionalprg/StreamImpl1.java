package functionalprg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamImpl1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,7,1,4,6);
        list.stream().limit(2).forEach(System.out::println);

        System.out.println("----------");
        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(a -> a % 2));
        collect.keySet().forEach(a-> System.out.println(collect.get(a)));
    }
}
