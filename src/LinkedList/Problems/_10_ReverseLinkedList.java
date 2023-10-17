package LinkedList.Problems;

import LinkedList.LL;
import LinkedList.LL.Node;

public class _10_ReverseLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 1; i <=10 ; i++) {
            list.insertLast(i);
        }
        list.display();
        reverseLL(list.head, list);
        list.display();
    }
    static void reverseLL(Node node,LL list){
        if(node == list.tail){
            list.head = list.tail;
            return;
        }
        reverseLL(node.next,list);

        list.tail.next = node;
        list.tail = node;
        list.tail.next = null;
    }
}
