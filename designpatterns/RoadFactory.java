package designpatterns;

public class RoadFactory implements TransportFactory{
    @Override
    public  Transport createTransport() {
        return new Road();
    }
}
