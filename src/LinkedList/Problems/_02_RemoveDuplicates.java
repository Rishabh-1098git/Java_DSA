package LinkedList.Problems;

import LinkedList.LL;

public class _02_RemoveDuplicates {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(4);

        list.display();
        list.removeDuplicates();
        list.display();
    }

}
