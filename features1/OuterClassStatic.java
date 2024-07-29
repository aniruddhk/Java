public class OuterClassStatic {
    final int x=10;
    final static int y=20;

    public static class InnerStaticClass{
        public InnerStaticClass(int m,int n){
           System.out.println("inside InnerStaticClass..."+m+"---"+n);
           System.out.println("Accessing x..."+y);

        }
    }
}
