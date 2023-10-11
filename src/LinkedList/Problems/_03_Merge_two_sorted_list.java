package LinkedList.Problems;

import LinkedList.LL;

public class _03_Merge_two_sorted_list {
    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(4);
        list1.display();

        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.display();
    }

    public static LL merge(LL list1, LL list2){
        LL.Node head1 = list1.head;
        LL.Node head2 = list2.head;
        LL ans = new LL();
        while(head1 != null && head2 != null){
            if(head1.value > head2.value){
                ans.insertLast(head2.value);
                head2 = head2.next;
            }
            else{
                ans.insertLast(head1.value);
                head1 = head1.next;
            }
        }
        while (head1 != null){
            ans.insertLast(head1.value);
            head1 = head1.next;
        }
        while (head2 != null){
            ans.insertLast(head2.value);
            head2 = head2.next;
        }

        return ans;
    }
}
