public class OuterClass {
    private int x = 1100;
    public static int counter = 0;

    private class InnerClass{
        private int getX(){
            return ++x;
        }
        public int getCounter(){
            return ++counter;
        }
    }
    InnerClass ob =null;
    OuterClass(){
        ob= new InnerClass();
    }
    public void getValues(){
        ob.getCounter();
        ob.getX();
    }


}
