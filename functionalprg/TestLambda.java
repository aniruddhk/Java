package functionalprg;

interface Math{
    int calculate(int a,int b);
}

public class TestLambda {
    public static void main(String[] args) {

        Math add = (int a,int b)-> a+b;
        Math sub = (int a,int b)-> a-b;
        Math multiply= (int a,int b)-> a*b;

        System.out.println("Add:"+add.calculate(10,20));
        System.out.println("sub:"+sub.calculate(10,20));
        System.out.println("multiply:"+multiply.calculate(10,20));
    }
}
