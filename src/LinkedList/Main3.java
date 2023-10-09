package LinkedList;

public class Main3 {
    public static void main(String[] args) {
        CircularLL list =  new CircularLL();
        for (int i = 1; i <=6 ; i++) {
            list.insert(i);
        }
        list.display();
        list.delete(6);
        list.display();
    }
}
