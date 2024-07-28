package designpatterns;

public class Circle implements Shape{

    Color c;
    public Circle(Color c){
    this.c = c;
    }
    @Override
    public void drawShap() {
        System.out.println("Drawing circle");
        c.fillColor();
    }
}
