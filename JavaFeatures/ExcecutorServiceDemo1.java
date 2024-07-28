package JavaFeatures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExcecutorServiceDemo1 {
    public static void main(String[] args) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Processor : "+numThreads);
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        for(int i=0; i<10; i++){
            int finalI = i;
            Future<Integer> submit = executorService.submit(() -> {
                System.out.println("Running Task : " + finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return finalI;
            });
        }
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        for(int i=0; i<10; i++){
            int finalI = i;
            executorService1.submit(()->{
                System.out.println("Running Task for CacheTread Pool : "+ finalI);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        };
        executorService1.close();
        executorService.close();
    }
}
