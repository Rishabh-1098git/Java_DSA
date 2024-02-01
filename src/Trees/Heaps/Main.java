package Trees.Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
//        Heap<Integer> heap = new Heap<>();
//        heap.insert(6);
//        heap.insert(2);
//        heap.insert(8);
//        heap.insert(1);
//        heap.insert(3);
//        heap.insert(5);
//        heap.insert(7);
//        heap.insert(4);
//        heap.insert(0);
//
//        heap.display();
//
//        System.out.println(heap.heapSort());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(16);
        list.add(9);
        list.add(10);
        list.add(14);
        list.add(8);
        list.add(7);

        Heap<Integer> heap = new Heap<>(list);
        heap.display();
        heap.insert(0);
        heap.display();

        for (int i = 0; i < 5; i++) {
            System.out.println(heap.remove());
        }


    }
}
