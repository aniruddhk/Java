package designpatterns;

public class Ship implements Transport{

    @Override
    public void transport() {
        System.out.println("This is transport via Ship route");

    }
}
