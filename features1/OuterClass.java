public class OuterClass {

    private static final int m=10;
    private final int n=20;
    public class InnerClass{
        private int x;
        private int y;
        protected InnerClass(int x,int y){
            this.x = x;
            this.y=y;
            System.out.println("Outer CLass M = "+m+" -- N="+n);
        }

    }

    InnerClass innerClass  = new InnerClass(50,80);
    public void testInner(){
        innerClass.y=60;
        System.out.println("Insider Outer Inner : "+innerClass.x+" -- "+innerClass.y);
    }

}

