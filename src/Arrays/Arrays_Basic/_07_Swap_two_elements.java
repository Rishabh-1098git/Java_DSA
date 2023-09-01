package Arrays.Arrays_Basic;

import java.util.Arrays;

public class _07_Swap_two_elements {
    public static void main(String[] args) {

        int[] arr = {1,2,5,4,3,6};
        System.out.println(Arrays.toString(arr));
        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] nums, int index1 ,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
