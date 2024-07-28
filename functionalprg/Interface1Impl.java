package functionalprg;

public class Interface1Impl {
    public static void main(String[] args) {
        Interface1 interface1 = new Interface1() {
            @Override
            public void addListener(String a, String b) {
                System.out.println(a+b);
            }
        };
        interface1.addListener("a","b");

        Interface1 interface2 = (a,b)-> System.out.println(a+b);
        interface2.addListener("a","b");
    }
}
