package functionalprg;

public interface Calculator<T> {

    public T calculate(T a,T b,MessagePrinter msg);
}
