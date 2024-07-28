package JavaFeatures;

public class AQueue<T> {

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

    public AQueue(int capacity){
        this.capacity = capacity;
        rear = null;
        front = null;
    }

    public void insert(T element){

        Node<T> node = new Node(element);

        if(capacity == counter){
            System.out.println("Queue Full");
            return;
        }
        if(rear == null){
            rear = node;
            front = node;
        }else{
            rear.next = node;
            rear = node;
        }
        counter++;

    }

    public void delete(){


        if (front == null) {
            System.out.println("Queue Empty");
            return;
        }
        if(front==rear){
            System.out.println("Deleted Element : "+front.element);
            front = rear = null;
        }else{
            System.out.println("Deleted Element : "+front.element);
            front = front.next;
        }

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
