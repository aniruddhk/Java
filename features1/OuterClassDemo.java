public class OuterClassDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.testInner();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(10,20);
        //System.out.println(innerClass.x+" -- "+innerClass.y);
        Addition<Integer> add = (Integer x,Integer y) -> x+y;
        Integer add1 = add.add(10, 20);
    }
}
