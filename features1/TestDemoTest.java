import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestDemoTest {
    public static void main(String[] args) {
        List<TestDemo> list = new ArrayList<>();

        TestDemo t1 = new TestDemo("1",30,20);
        TestDemo t2 = new TestDemo("2",90,50);
        TestDemo t3 = new TestDemo("3",70,50);
        list.add(t1);
        list.add(t2);
        list.add(t3);

        Collections.sort(list, (e1, e2)-> e1.compareTo(e2));

        System.out.println(list);

    }
}
