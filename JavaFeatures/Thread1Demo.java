package JavaFeatures;

public class Thread1Demo {
    public static void main(String args[]){
        Runnable runnable  = ()->{
            System.out.println("This is runnable thread lambda");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };

        Thread thread = new Thread(){
            public void run() {
                System.out.println("Anonymous thread class");
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is runnable thread anonymous");
            }
        };

        Thread t1 = new Thread(runnable1);

        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        thread.start();


    }
}
