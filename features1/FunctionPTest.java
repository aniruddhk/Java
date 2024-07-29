
public class FunctionPTest {
    private void testAddition(){
        Addition<Double> add = (t1,t2) -> t1+t2;
        System.out.println(add.add(10.5,20.0));
    }

    /**
     *
     * Function as method parameter
     * @param addition
     */
    public static void executor(Addition addition){
        System.out.println(addition.add("Aniruddh","K"));
    }
    public static void main(String args[]){
        FunctionPTest ob = new FunctionPTest();
        ob.testAddition();

        //Function to variable assignment
        Addition<String> str = (str1,str2)->str1+" "+str2;

        //Function passed as an argument
        executor(str);
    }
}
