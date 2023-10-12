package LinkedList.Problems;


import LinkedList.LL;

public class _04_LinkedListCycle {
    public static void main(String[] args) {
        LL list = new LL();

        System.out.println(hasCycle(list.head));
    }
    public static boolean hasCycle(LL.Node head) {

        LL.Node slow = head;
        LL.Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    // Question-5 ==> length of cycle

    public static int lengthCycle(LL.Node head) {

        LL.Node slow = head;
        LL.Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                LL.Node temp = slow;
                int length=0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }

}
