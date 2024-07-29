
interface test{
    public int math(int x,int y);
}
public class LamdaExpressionDemo2 {
    public static void main(String[] args) {
        int test=10;
        test a  = (x, y) -> {
            int n=10;
            n=x+y;

            //int z= x+y;
            System.out.println("inside : "+n);
            return n;
        };
        int add = a.math(10,20);

        test b = (x, y) -> x-y;
        int sub = b.math(10,20);
        System.out.println(add);
        System.out.println(sub);



    }
}
