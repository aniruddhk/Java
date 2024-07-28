package JavaFeatures;

public class RotateLinkedList {
    static class ListNode{

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; next=null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        if(k>count){
            k = k%count;
        }
        if(k==0 || count==1){
            return head;
        }
        System.out.println("Count : "+count+" -- k = "+k);

        int n =count - k;
        temp = head;
        int i=0;
        ListNode prev = null;
        while(temp.next!=null && i<n){
            prev = temp;
            temp=temp.next;
            i++;
        }

        ListNode newHead = temp;
        while(temp.next!=null){
            System.out.println("Loop : "+temp.val);
            temp = temp.next;
        }
        System.out.println("Out : "+temp.val);


        if(prev!=null){
            System.out.println("Prev : "+prev.val);
            prev.next = null;
            temp.next = head;
        }

        return newHead;

    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode head = listNode1;
        ListNode listNode = rotateRight(head, 2);
        ListNode temp = listNode;
        while(temp!=null){
            System.out.println("-->"+temp.val);
            temp = temp.next;
        }


    }
}
