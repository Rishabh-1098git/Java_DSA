package LinkedList.Problems;

import LinkedList.LL;
import LinkedList.LL.Node;

public class _16_Add_Two_LinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1= l1;
        ListNode temp2= l2;
        int value = 0;
        int carry = 0;
        ListNode newHead = new ListNode();
        ListNode prev = newHead;

        while(temp1!=null || temp2!=null){
            if(temp1 == l1 && temp2==l2){
                prev.val = (temp1.val+temp2.val)%10;
                carry =  (temp1.val+temp2.val)/10;
                temp1 = temp1.next;
                temp2 = temp2.next;
                continue;
            }
            if(temp2!=null && temp1!=null){
                value = (temp1.val+temp2.val)%10;
            }
            else{
                value = temp1==null ? temp2.val:temp1.val;
            }
            ListNode newNode = new ListNode();
            if(temp2!=null && temp1!=null){
                newNode.val = (value+carry)%10;
            }
            else{
                newNode.val = (value+carry)%10;
                carry = (value+carry)/10;
            }

            if(temp2!=null && temp1!=null){
                carry = (temp1.val+temp2.val+carry)/10;
            }

            prev.next = newNode;
            prev = newNode;
            if(temp1 !=null){
                temp1 = temp1.next;
            }
            if(temp2!=null){
                temp2 = temp2.next;
            }
        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            prev.next = newNode;
        }
        return newHead;
    }
}
