import java.util.function.BiFunction;

public class FunctionAsData {

    //Function as argument/parameter

    protected static class Test{
        public static Integer add(Integer x,Integer y){
            return x+y;
        }
        public static Integer sub(Integer x,Integer y){
            return x-y;
        }
        public static Integer total(BiFunction<Integer,Integer,Integer> biFunction){
            return biFunction.apply(2,3);
        }


    }
    public static void main(String[] args) {
        int x= Test.total(Test::add);
        System.out.println((x));
        System.out.println(Test.total(Test::sub));
        System.out.println(Test.total((a,b) -> Test.add(a,b)));

    }
}
