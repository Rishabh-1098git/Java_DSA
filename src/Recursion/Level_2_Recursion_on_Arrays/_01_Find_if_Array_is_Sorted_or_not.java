package Recursion.Level_2_Recursion_on_Arrays;
public class _01_Find_if_Array_is_Sorted_or_not {
    public static void main(String[] args) {
        int[] arr  = {23};
        System.out.println(isSorted1(arr));
        System.out.println(isSorted2(arr));
    }
    static boolean isSorted1(int [] arr){
        return helper(arr,0);
    }
    static boolean isSorted2(int [] arr){
        return helper1(arr,0);
    }
    static boolean helper(int [] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return helper(arr, i+1);
    }
    static boolean helper1(int [] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && helper(arr,i+1);
    }
}
