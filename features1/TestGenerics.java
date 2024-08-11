import java.util.List;

class Generics<T>{

    public T add(T a,T b){

       if(a instanceof Integer && b instanceof Integer ){

       }
        return a;
    }
    public void add(List<? super Integer> list){
       // list.stream().reduce((acc,cur)->acc+cur,0)
    }

}
public class TestGenerics {
    public static void main(String[] args) {
        Generics<Integer> ob1 = new Generics<>();
        ob1.add(10,20);
    }
}
