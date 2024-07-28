package designpatterns;

public class FactoryDesignDemo {
    public static void main(String[] args) {
        TransportFactory roadFactory = new RoadFactory();
        Transport transport = roadFactory.createTransport();
        transport.transport();

        TransportFactory shipFactory = new ShipFactory();
        Transport transport1 = shipFactory.createTransport();
        transport1.transport();
    }
}
