package LinkedList.Problems;

import LinkedList.LL;
import LinkedList.LL.Node;

public class _09_BubbleSort {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 1; i <=10 ; i++) {
            list.insertFirst(i);
        }
        list.display();
        bubbleSort(list,9,0);
        list.display();
    }
    static void bubbleSort(LL list, int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            Node first = list.get(col);
            Node second = list.get(col+1);
            if(first.value > second.value ){
                // swap
                if(first == list.head){
                    list.head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second== list.tail) {
                    Node prev = list.get(col-1);
                    prev.next = second;
                    list.tail = first;
                    first.next = null;
                    second.next = list.tail;
                }
                else {
                    Node prev = list.get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(list,row,col+1);
        }
        else{
            bubbleSort(list, row - 1, 0);
        }
    }
}
