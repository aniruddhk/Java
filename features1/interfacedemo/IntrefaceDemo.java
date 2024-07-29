package interfacedemo;

public class IntrefaceDemo implements Interface1,Interface2 {

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public void print(String x) {
        Interface1.super.print("Not printing");
    }

    public static void main(String[] args) {
        Interface1 ob = new IntrefaceDemo();
        System.out.println(ob.add(10,20));
        ob.print("Printing...");
    }

}
