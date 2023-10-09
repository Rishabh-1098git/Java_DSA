package LinkedList;

public class DoublyLL {
    private int size;
    private Node head;
    private Node tail;
    public void insertFirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        newnode.prev = null;
        if(head != null) {
            head.prev = newnode;
        }
        head = newnode;
        size++;
    }

    public void display(){
        Node node = head;
        Node last = null;
        System.out.println("Print in correct order...");
        System.out.print("null <--> ");
        while(node!=null){
            System.out.print(node.val+" <--> ");
            last = node;
            node = node.next;
        }
        System.out.println("null");

        System.out.println("Print in reverse...");
        System.out.print("null <--> ");
        while(last!=null){
            System.out.print(last.val+" <--> ");
            last = last.prev;
        }
        System.out.println("null");
    }

    public void insertLast(int val){
        Node newnode = new Node(val);
        newnode.next = null;

        if(head == null){
            head = newnode;
            newnode.prev = null;
            return;
        }

        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newnode;
        newnode.prev = last;

    }

    public void insert(int val, int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(val);
        newnode.next = temp.next;
        temp.next.prev = newnode;
        temp.next = newnode;
        newnode.prev = temp;
    }
    private  class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
