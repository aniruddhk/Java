package interfacedemo;

public interface Interface1 {
    public int add(int x,int y);
    default void print(String x){
        System.out.println("Printing Interface : "+x);
    }
}
