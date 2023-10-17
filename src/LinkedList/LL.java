package LinkedList;



public class LL {
    public Node head;
    public Node tail;
    private int size;

    public LL() {
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
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(val,temp.next);
        temp.next = newnode;
        size++;
    }

    public void insertRec(int val, int index){
        head = insertRec1(val, index,head);
    }
    private Node insertRec1(int val, int index, Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec1(val,index-1,node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node node = get(size-2);
        int val = tail.value;
        tail = node;
        tail.next = null;

        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
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

    public static class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);

        LL list2 = new LL();
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);

        LL ans = merge(list1, list2);
        ans.display();

    }

    // Question-2 ==> Remove Duplicates
    public void removeDuplicates(){
        Node temp = head;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    // Question 3 ==>
    public static LL merge(LL list1, LL list2){
        Node head1 = list1.head;
        Node head2 = list2.head;
        LL ans = new LL();
        while(head1 != null && head2 != null){
            if(head1.value > head2.value){
                ans.insertLast(head2.value);
                head2 = head2.next;
            }
            else{
                ans.insertLast(head1.value);
                head1 = head1.next;
            }
        }
        while (head1 != null){
            ans.insertLast(head1.value);
            head1 = head1.next;
        }
        while (head2 != null){
            ans.insertLast(head2.value);
            head2 = head2.next;
        }

       return ans;
    }

    // Question-4 ==> LinkedList Cycle

//    public static boolean isCycle(LL list){
//
//    }
}
