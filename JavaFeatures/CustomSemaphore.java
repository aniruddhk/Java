package JavaFeatures;

public class CustomSemaphore {
    int limit;
    int count;

    public CustomSemaphore(int limit){
        count = 0;
        this.limit = limit;
    }
    public synchronized void acquire() throws InterruptedException {
        if(limit==0)
            wait();
        limit--;
    }
    public synchronized void release(){
        limit++;
        notify();
    }
}
