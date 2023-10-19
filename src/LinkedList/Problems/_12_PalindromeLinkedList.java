package LinkedList.Problems;

import LinkedList.LL;
import LinkedList.LL.Node;

public class _12_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        while( headSecond!=null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        if(head == null || headSecond == null){
            return true;
        }
        else{
            return false;
        }


    }
    public ListNode reverseList(ListNode head) {
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
