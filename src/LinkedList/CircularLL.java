package LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    public void insert(int val){
        Node newnode = new Node(val);
        if(head==null){
            head = newnode;
            tail = newnode;
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
    }

    public void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }
    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.val+" -> ");
                node = node.next;
            }while(node!=head);
            System.out.println("head");
        }
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
