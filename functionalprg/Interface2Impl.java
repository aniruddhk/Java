package functionalprg;

public class Interface2Impl {
    public static void main(String[] args) {
        int x=10;
        Interface2<Integer> interface2 = (a,b)->{
            System.out.println("a = "+a+ " ---- b = "+b);
            return a+b+x;
        };

        String str = "";
        Interface2<String> interface3 = (a,b)->{
            System.out.println("a = "+a+ " ---- b = "+b);
            return a+b+str;
        };
        //str = "dd";   would thrown an error
        System.out.println("Sum : "+interface2.add(1, 2));
        System.out.println("Concat : "+interface3.add("A", "B"));


    }
}
