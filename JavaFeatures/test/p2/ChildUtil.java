package JavaFeatures.test.p2;


import JavaFeatures.test.p1.ParentUtil;

public class ChildUtil extends ParentUtil {
    public static void main(String args[]){
        new ChildUtil().callStuff();
    }

    void  callStuff(){
        System.out.println(this.doStuff());
        ParentUtil p = new ParentUtil();
        //System.out.println("Parent = "+p.doStuf());
    }
}
