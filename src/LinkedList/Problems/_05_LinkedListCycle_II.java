package LinkedList.Problems;

import LinkedList.LL;

public class _05_LinkedListCycle_II {
    public LL.Node detectCycle(LL.Node head) {
        LL.Node fast = head;
        LL.Node slow = head;

        int length=0;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                LL.Node temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                break;
            }
        }

        if(length==0){
            return null;
        }

        LL.Node s = head;
        LL.Node f = head;

        while(length>0){
            s = s.next;
            length--;
        }

        while(f!=s){
            f = f.next;
            s = s.next;
        }
        return f;
    }

}
