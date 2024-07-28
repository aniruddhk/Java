package designpatterns;

public class BridgeDesignPattern {
    public static void main(String[] args) {
        Color c = new BlueColor();
        Shape s = new Circle(c);
        s.drawShap();
    }
}
