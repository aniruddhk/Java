package JavaFeatures;

public class Lock {
    private boolean isLocked;

    public synchronized void lock() throws InterruptedException {

       while(isLocked){
           wait();
       }
       isLocked = true;

    }
    public synchronized void unlock(){
        isLocked = false;
        notify();
    }
}
