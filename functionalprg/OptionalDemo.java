package functionalprg;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {
        String s=null;

        Optional.ofNullable(s).ifPresentOrElse(x-> System.out.println("x= "+x),()->{
            System.out.println("Missing");
        });
    }
}
