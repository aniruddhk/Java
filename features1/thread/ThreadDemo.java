package thread;

class Thread1  implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
            System.out.println("Overriding Runnable");
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Overriding Thread");
    }
}


public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Thread1());
        Thread2 t2 = new Thread2();
        Thread t3 = new Thread(() -> System.out.println("hello"));
        Runnable runnable = () -> {
            System.out.println("My Name is : "+Thread.currentThread().getName());
            System.out.println("Runnable123");
        };
        Thread t4 = new Thread(runnable,"Sheela");
        t1.start();
        t1.join();
        t2.start();
        t3.start();
        t4.start();

        Runnable test = () -> {
            while(true){
                try {
                    System.out.println("Sleeping");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t5 = new Thread(test,"Test Sleep...");
        t5.setDaemon(true);
        t5.start();

    }
}
