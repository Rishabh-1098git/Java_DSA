package Arrays.Arrays_Basic;

import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
            int [] arr = {1,1,1,2,2,3};
            removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int count =0 ;

        for(int i=0;i<nums.length;i++){
            maxi = Math.max(maxi,nums[i]);
        }

        int[] hash = new int[maxi+1];
        for (int i = 0; i < nums.length ; i++) {
            hash[nums[i]]++;
        }
        int i=0;

        while(i<nums.length){
            if(nums[i]==hash.length-1){
                break;
            }
            if(hash[i]>2){
                int temp = i+2;
                while(temp<nums.length-1){
                    swap(nums,temp,temp+1);
                    temp++;
                }
            }

            i++;
        }
        return -1;
    }
    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
