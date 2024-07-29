

public class TestDemo implements Comparable<TestDemo>{

    private String s;

    public TestDemo(String s, Integer s1, Integer s2) {
        this.s = s;
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "TestDemo{" +
                "s='" + s + '\'' +
                ", s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }

    Integer s1;
    Integer s2;

    @Override
    public int compareTo(TestDemo o) {
        return Integer.compare((o.s1-o.s2),(this.s1-this.s2));
    }
}
