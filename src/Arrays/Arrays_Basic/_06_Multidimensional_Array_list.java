package Arrays.Arrays_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _06_Multidimensional_Array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // first we have to initialise the lists inside the outer arraylist
        for (int i = 0; i <3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i <3 ; i++) { // this will get each list in the arraylist
            for (int j = 0; j <3 ; j++) { // this will add elements in the inner lists
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

    }
}
