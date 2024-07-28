package designpatterns;

public class Road implements Transport{
    @Override
    public void transport() {
        System.out.println("This is transport mode via Road");
    }
}
