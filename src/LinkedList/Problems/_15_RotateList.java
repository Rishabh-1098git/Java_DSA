package LinkedList.Problems;

public class _15_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode last = head;
        int length = 1;
        while(last.next!=null){
            last = last.next;
            length++;
        }
        last.next = head;

        int rotations = k%length;
        int skips = length-rotations;
        ListNode newEnd = head;

        for(int i=0;i<skips-1;i++){
            newEnd = newEnd.next;
        }
        head = newEnd.next;
        newEnd.next = null;

        return head;
    }
}
