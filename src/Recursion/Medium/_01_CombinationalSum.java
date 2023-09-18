package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;
public class _01_CombinationalSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4};

    }


    static int sum(List<Integer> list){
        int s = 0;
        for (int i = 0; i < list.size() ; i++) {
            s+=list.get(i);
        }
        return s;
    }
}
