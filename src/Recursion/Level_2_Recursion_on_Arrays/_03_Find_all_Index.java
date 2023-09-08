package Recursion.Level_2_Recursion_on_Arrays;

import java.util.ArrayList;

public class _03_Find_all_Index {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,4,4,5,6};
        int target = 4;
        findAllIndex(arr, target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[]arr, int target, int count){
        if(count==arr.length){
            return;
        }
        else if (arr[count]==target) {
            list.add(count);
        }
        findAllIndex(arr, target, count+1);
    }
}
