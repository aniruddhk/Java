public class NestecClassDemo {
    public static void main(String[] args) {
        JavaNested javaNested = new JavaNested();
        JavaNested.Nested nested = javaNested.new Nested();
        javaNested.printStr();
        nested.printStr();
        JavaNested.StaticClass staticClass = new JavaNested.StaticClass();


    }
}
