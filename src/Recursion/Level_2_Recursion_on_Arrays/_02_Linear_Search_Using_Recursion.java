package Recursion.Level_2_Recursion_on_Arrays;

public class _02_Linear_Search_Using_Recursion {
    public static void main(String[] args) {
        int [] arr = {3,2,1,18,9};
        int target = 3;
        System.out.println(find_in_array(arr,target));
    }
    static int find_in_array(int [] arr, int target){
        return helper(arr, target,0);
    }
    static int helper(int[]arr, int target, int i){
        if(i>arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return helper(arr, target, i+1);
    }
}
