package designpatterns;

import java.io.Serializable;

public final class Singleton implements Serializable,Cloneable {
    private static transient Singleton singleton = null;

    public static Singleton getSingleton(){
        if(singleton==null){
            System.out.println("Instance null, creating a new one!");
            singleton =  new Singleton();
            return singleton;
        }else{
            System.out.println("Instance not null, returning existing!");
            return singleton;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

   protected Object readResolve(){
       return singleton;
   }

    private Singleton(){
        if(singleton!=null){
            throw new IllegalAccessError();
        }
    }
}
