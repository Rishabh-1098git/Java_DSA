package Arrays.Arrays_Basic;

import java.util.*;

public class _05_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(23); // to add values in the array list
//        list.add(45);
//        list.add(267);
//        list.add(2789);
//        list.add(455);
//        list.add(56);
//
//        System.out.println(list);
//
//        list.set(0,6969); // change 0th index element to 6969
//
//        System.out.println(list);
//        list.remove(0); // remove element at oth index
//        System.out.println(list);
//
        // to take input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
//        list.size();

        // to iterate through the list
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }

}




