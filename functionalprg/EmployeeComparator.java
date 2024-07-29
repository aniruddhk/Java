package functionalprg;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeComparator {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"A","B");
        Employee e2 = new Employee(104,"c","D");
        Employee e3 = new Employee(100,"E","F");
        Employee e4 = new Employee(190,"E","H");
        Employee e5 = new Employee(112,"I","J");

        List<Employee> list  = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list, Comparator.comparingInt(Employee::getId));
        System.out.println(list);

        System.out.println(list.stream().allMatch(x->x.getId()>=100));

        System.out.println(list.stream().findAny());

        List<Employee> tempList = list.stream().filter(v1->v1.getId()<=100).collect(Collectors.toList());
        System.out.println(tempList);

        System.out.println(list.stream().map(employee -> employee.getId()).collect(Collectors.toSet()));

        System.out.println(list.stream().collect(Collectors.groupingBy(employee -> employee.getFirstName())));
    }
}
