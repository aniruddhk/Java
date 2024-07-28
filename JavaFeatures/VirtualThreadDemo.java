public class VirtualThreadDemo {public static void main(String args[]){
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
            System.out.println("Anonymous thread class"+this.getName());
        }
    };

    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("This is runnable thread anonymous");
        }
    };

    Thread t1 =  Thread.ofVirtual().start(runnable);

    Thread t2 = Thread.ofVirtual().unstarted(runnable1);
    //t1.start();
    t2.start();
    thread.start();


}
}
