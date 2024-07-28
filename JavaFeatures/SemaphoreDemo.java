package JavaFeatures;

public class SemaphoreDemo {
    private static final int MAX_CONCURRENT_THREADS = 3;
    //private static final Semaphore semaphore = new Semaphore(MAX_CONCURRENT_THREADS);
    private static final CustomSemaphore semaphore = new CustomSemaphore(MAX_CONCURRENT_THREADS);

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new WorkerThread(i));
            thread.start();
        }
    }
    static class WorkerThread implements Runnable {
        private final int id;

        WorkerThread(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                // Acquire a permit before accessing the resource
                semaphore.acquire();
                System.out.println("Thread " + id + " is working.");
                // Simulate work by sleeping
                Thread.sleep(2000);
                System.out.println("Thread " + id + " has finished working.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Release the permit after work is done
                semaphore.release();
            }
        }
    }

}
