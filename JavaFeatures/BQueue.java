package JavaFeatures;

public class BQueue<T> {

    private Node<T> rear;
    private Node<T> front;
    int capacity;
    private int counter;

    private static class Node<T>{
        T element;
        Node<T> next;

        Node(T element){
            next = null;
            this.element = element;
        }
    }

    public BQueue(int capacity){
        this.capacity = capacity;
        rear = null;
        front = null;
    }

    public synchronized void insert(T element) throws InterruptedException {

        Node<T> node = new Node(element);

        while(capacity == counter){
            System.out.println(capacity + "---"+counter);
            System.out.println("Queue Full");
            wait();
        }
        if(rear == null){
            rear = node;
            front = node;
        }else{
            rear.next = node;
            rear = node;
        }
        counter++;
        notifyAll();

    }

    public synchronized void delete() throws InterruptedException {


        while (front == null) {
            System.out.println("Queue Empty");
            wait();
        }
        if(front==rear){
            System.out.println("Deleted Element : "+front.element);
            front = rear = null;
        }else{
            System.out.println("Deleted Element : "+front.element);
            front = front.next;
        }
        notifyAll();

    }
    public void print(){
        System.out.println("Queue Elements are : ");
        Node<T> temp = front;
        while(temp!=null){
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
}
