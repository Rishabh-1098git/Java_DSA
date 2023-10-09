package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 1; i <= 10; i++) {
            if(i<=5){
                list.insertFirst(i);
            }
            else {
                list.insertLast(i);
            }
        }
        list.display();

        list.insert(6969,4);
        list.deleteFirst();

        list.display();

        list.deleteLast();
        list.display();

        list.delete(3);
        list.display();
    }
}
