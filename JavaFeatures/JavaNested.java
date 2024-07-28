public class JavaNested {
    private String str = "JavaNested";
    public JavaNested(){
        System.out.println("I am an Outer class.");
    }
    public void printStr(){
        System.out.println(this.getClass()+ " -> "+str);
    }
    public class Nested{
        private String str = "Nested";
        public Nested(){
            System.out.println("I am a Nested class.");
            TestPrivateClass testPrivateClass = new TestPrivateClass();
        }
        public void printStr(){
            System.out.println(this.getClass()+ " -> "+str);
        }
    }
    public static class StaticClass{
        {
            System.out.println("I am a nested static class.");
        }
        StaticClass(){
            System.out.println("I am a nested static class(M).");
        }

    }

    private class TestPrivateClass{
        TestPrivateClass(){
            System.out.println("TestPrivateClass ");
        }
    }
}
