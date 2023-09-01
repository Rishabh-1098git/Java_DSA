package Arrays;

import java.util.Arrays;

public class _09_Reverse_an_Array {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // My_method
    /*
    static void reverse(int[] arr){
        int l = arr.length;
        for (int i = 0; i <=(l/2)-1 ; i++) {
            swap(arr, i, l-i-1);
        }
    }
    */

    // two pointer method
    static void reverse(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // function to swap->
    static void swap(int[] nums, int index1 ,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }


}
