package functionalprg;

interface Message{
    String print(String msg);
}
public class VariableTest {
    public static void main(String[] args) {
        String commonMsg = "Hello ";
        Message msg  = (s1) ->  commonMsg+s1;

        System.out.println(msg.print("AK"));

        var e1=1+"";
        var x = new String[10];
        x[0] = "0";
        System.out.println(e1 instanceof String);


    }


}
