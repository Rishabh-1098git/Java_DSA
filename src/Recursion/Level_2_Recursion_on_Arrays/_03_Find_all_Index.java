package Recursion.Level_2_Recursion_on_Arrays;

import java.util.ArrayList;

public class _03_Find_all_Index {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,4,4,5,6};
        int target = 4;
//        findAllIndex(arr, target,0);
//        System.out.println(list);

//        ArrayList<Integer> list2 = new ArrayList<>();
//        System.out.println(findAllIndex2(arr, target, 0, list2));

        System.out.println(findAllIndex3(arr,target,0));
    }

    // adding elements out side the function.
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

    // giving ArrayList as a Argument in the recursive function
    static ArrayList<Integer> findAllIndex2(int [] arr, int t,int count ,ArrayList<Integer>list){
        if(count==arr.length){
            return list;
        }
        else if (arr[count]==t) {
            list.add(count);
        }
        return findAllIndex2(arr, t, count+1,list);
    }

    // not giving ArrayList as an Arguments but returning a ArrayList
    static ArrayList<Integer> findAllIndex3(int[] arr,int target, int count){
        ArrayList<Integer> list = new ArrayList<>();
        if(count==arr.length){
            return list;
        }
        if(arr[count]==target){
            list.add(count);
        }
        // this will contain index of particular call
        ArrayList<Integer> fromBelowCalls = findAllIndex3(arr, target, count+1);
        list.addAll(fromBelowCalls);
        return list;
    }

}
