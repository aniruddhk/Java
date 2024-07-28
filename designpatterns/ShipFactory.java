package designpatterns;

public class ShipFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
