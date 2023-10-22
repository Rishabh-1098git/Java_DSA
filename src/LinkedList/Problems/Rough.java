package LinkedList.Problems;
import LinkedList.LL;
import LinkedList.LL.Node;

public class Rough {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 1; i <=10 ; i++) {
            list.insertLast(i);
        }
        list.display();
        recReverseLL(list, list.head);
        list.display();
    }
    static void recReverseLL(LL list, Node node){
        if(node == list.tail){
            list.head = list.tail;
            return;
        }
        recReverseLL(list, node.next);
        list.tail.next = node;
        list.tail = node;
        list.tail.next =null;
    }
    static void reverseLL(LL list){
        if(list.head == null || list.head.next == null){
            return;
        }
        Node prev = null;
        Node curr = list.head;
        Node nxt = list.head.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = nxt;
            if(nxt!=null){
                nxt = nxt.next;
            }
        }
        list.head = prev;
    }

}
