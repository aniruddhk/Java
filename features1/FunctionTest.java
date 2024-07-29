
import java.util.function.Function;
public class FunctionTest {

    protected static class TrippleTest{
        public static int tripple(int x){
            return x*3;
        }
    }


    public static void main(String[] args) {
        //System.out.println(tripple(10));
        Function<Integer,Integer> mytripple=TrippleTest::tripple;
        System.out.println(mytripple.apply(7));

    }
}
