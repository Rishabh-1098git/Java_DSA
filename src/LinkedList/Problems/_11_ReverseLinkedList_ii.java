package LinkedList.Problems;

import LinkedList.LL;
import LinkedList.LL.Node;

public class _11_ReverseLinkedList_ii {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 1; i <=5 ; i++) {
            list.insertLast(i);
        }
        list.display();

    }
    static Node reverseInRange(Node head, int right, int left){
        if(left == right){
            return head;
        }

        Node current = head;
        Node prev = null;

        for (int i = 0;current!=null && i < left-1; i++) {
                prev = current;
                current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        Node nxt = current.next;
        for (int i = 0;current!=null &&  i < right-left+1; i++) {
            current.next = prev;
            prev = current;
            current = nxt;
            if (nxt!=null) {
                nxt = nxt.next;
            }
        }

        if(last!=null){
            last = prev;
        }else{
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
}
