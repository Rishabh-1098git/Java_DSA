package LinkedList.Problems;

public class _08_MergeSort {

    static ListNode sortList (ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMiddleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }
    static ListNode getMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head  = new ListNode();
        ListNode temp = head;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
            else{
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
        }
        while(list1!=null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while(list2!=null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return head.next;
    }
}
