package designpatterns;

import designpatterns.Singleton;

public class SingletonDemo1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();


    }
}
