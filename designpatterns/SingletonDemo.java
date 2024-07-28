package designpatterns;

public class SingletonDemo {
    public static void main(String[] args) throws IllegalAccessException {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        singletonPattern.print();
    }
}
