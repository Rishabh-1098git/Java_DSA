package LinkedList.Problems;

public class _14_ReverseNodesInKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        int l = len(head);
        int count=0;

        while(true){


            ListNode last = prev;
            ListNode newEnd = current;


            ListNode nxt = current.next;


            for (int i = 0; current!=null &&  i < k; i++) {
                current.next = prev;
                prev = current;
                current = nxt;
                if (nxt!=null) {
                    nxt = nxt.next;
                }
            }

            if(last!=null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;

            if(current == null){
                break;
            }
            prev = newEnd;

            count+=k;
            if((l-count)<=k){
                break;
            }
        }
        return head;
    }
    static int len(ListNode head){
        ListNode temp = head;
        int count =1;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
