package thread;

public class Counter {
    private  int count = 0;

    public int increment(){
        synchronized (this){
            this.count++;
        }

        return count;
    }
}
