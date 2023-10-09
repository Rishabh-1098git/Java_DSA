package LinkedList;

public class Main2 {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        for (int i = 1; i <=5 ; i++) {
            list.insertFirst(i);
        }
        list.display();
        list.insert(22,4);
        list.display();
        list.insertLast(111);
        list.display();
    }
}
