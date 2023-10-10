package LinkedList.Problems;

public class _01_LL1 {
    public static void main(String[] args) {
        _01_LL1 list = new _01_LL1();
        for (int i = 0; i < 5; i++) {
            list.insertFirst(i+1);
        }
        list.display();
        list.insertRec(2,44);
        list.display();
    }
    private Node head;
    private Node tail;
    private int size;

    public _01_LL1() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public void insertRec(int value, int index){
            head = insertRec(value, index, head);
    }
    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1,node.next);
    return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
