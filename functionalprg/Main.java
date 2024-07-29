package functionalprg;

import java.util.Arrays;

interface Testing{
    public void print(String... a);
}

public class Main {
    public static void main(String[] args) {

        Testing t1  = (String...list) -> {
            Arrays.stream(list).sorted().forEach(System.out::println);};
        t1.print("C","A","T");

    }
}