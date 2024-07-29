package streams;

import java.util.*;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> list = PersonTest.getPeople();
        List<Person> filteredList = list.stream().filter(x-> x.getGender()==Gender.MALE).collect(Collectors.toList());

        List<Person> ageSorted = list.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        System.out.println(ageSorted);

        boolean b = list.stream().allMatch(x -> x.getAge() >7);
        System.out.println("Age allMatch : "+b);
        boolean b1 = list.stream().anyMatch(x -> x.getAge() ==20);
        System.out.println("Age anyMatch : "+b1);

        boolean b2 = list.stream().noneMatch(x -> x.getAge() ==120);
        System.out.println("Age noneMatch : "+b2);

        list.stream().max((x,y)->Integer.compare(x.getAge(),y.getAge())).ifPresent(System.out::println);

        Map<Gender, List<Person>> collect = list.stream().collect(Collectors.groupingBy(x -> x.getGender()));

        System.out.println("Hello"+list.stream().distinct().collect(Collectors.toSet()));
        Collection<Gender> collect1 = list.stream().map(x -> x.getGender()).collect(Collectors.toSet());
        System.out.println(collect1);
        Map<String,Integer> map = new HashMap<>();
        map.put("a1",10);
        map.put("a2",30);
        map.put("a3",20);
        map.put("a4",60);

        //map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue).reversed())

    }
    private static List<Person> getPeople() {
        return List.of(
                new Person("a1", 20, Gender.MALE),
                new Person("a2", 33, Gender.FEMALE),
                new Person("a3", 57, Gender.FEMALE),
                new Person("a4", 14, Gender.MALE),
                new Person("a5", 99, Gender.MALE),
                new Person("a6", 7, Gender.FEMALE),
                new Person("a7", 67, Gender.FEMALE)
        );
    }
}
