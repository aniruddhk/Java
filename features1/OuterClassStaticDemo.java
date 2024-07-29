public class OuterClassStaticDemo {
    public static void main(String[] args) {
        OuterClassStatic outerClassStatic = new OuterClassStatic();
        OuterClassStatic.InnerStaticClass innerStaticClass = new OuterClassStatic.InnerStaticClass(10,20);

    }
}
