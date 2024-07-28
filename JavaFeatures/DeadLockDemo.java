package JavaFeatures;

public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        deadLockDemo.demo();

    }

    private void demo(){
        String s1="S1";
        String s2="S2";

        Thread t1 = new Thread(()->{
            synchronized (s1) {
                try {
                    System.out.println("T1 S1");
                    s1.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (s2){
                s1.notify();
                try {
                    s2.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T1 s2");
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (s2){
                try {
                    System.out.println("T2 S2");
                    s2.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (s1){
                s2.notify();
                try {
                    s1.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T2 s2");
            }
        });
        t1.start();
        t2.start();
    }



}
