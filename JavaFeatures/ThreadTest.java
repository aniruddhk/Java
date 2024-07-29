package JavaFeatures;

class ThreadTest{
    public static void main(String args[]){
        Runnable runnable = new Runnable(){
          

            @Override
            public void run() {
                System.out.println("Thread");
                
            }
            
        };


        Runnable runnable1 = ()->{
            String name = Thread.currentThread().getName();
            System.out.println("Thread 2: "+name+" running...");
            
        };
        Thread thread = new Thread(runnable);
        Thread thread1 = new Thread(runnable1,"MyThread");
        thread.start();
        thread1.start();
     
    }
}