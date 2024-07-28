package designpatterns;

public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;
    private SingletonPattern(){

    }

    public static SingletonPattern getInstance() throws IllegalAccessException {
        if(singletonPattern==null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
    public void print(){
        System.out.println("Singleton demo...");
    }


}
