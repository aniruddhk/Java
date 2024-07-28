package JavaFeatures;

public class QueueDemo {
    public static void main(String[] args) throws InterruptedException {
        AQueue<Integer> queue = new AQueue<>(3);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        queue.print();
        queue.delete();
        queue.print();
        queue.delete();
        queue.delete();
        queue.delete();

        BQueue<String> bQueue = new BQueue<>(3);
        bQueue.insert("hello");
        bQueue.insert("this");
        bQueue.insert("is");
        bQueue.insert("a");
        bQueue.print();
        bQueue.delete();
        bQueue.delete();
        bQueue.delete();
        bQueue.delete();


    }
}
