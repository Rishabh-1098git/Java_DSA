package LinkedList.Problems;

public class _13_ReorderList {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid = getMiddleNode(head);
        ListNode hf = head;
        ListNode hs = reverseList(mid);


        while(hf!=null && hs!=null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf != null){
            hf.next = null;
        }

    }
    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode nxt = head.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
        }
        return prev;
    }
    static ListNode getMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
