package Strings.StringMatchingAlgorithms;

import java.util.Arrays;

public class KMP {
    public static void main(String[] args) {

        int[] nums = {1,10,11,12,13,2,3,4,5,6,7,8,9};

        String [] strNums = new String[nums.length];

        for(int i=0; i<nums.length; i++){
            strNums[i] = "" + nums[i];
        }

        customBubbleSort(strNums);

        System.out.println(Arrays.toString(strNums));

    }

    public static void customBubbleSort(String[] nums){
        int n = nums.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                String first = nums[j] + nums[j+1];
                String second = nums[j+1] + nums[j];
                if (second.compareTo(first) > 0) {
                    String temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
               else if(second.compareTo(first) == 0){
                    if(Integer.parseInt(nums[j+1]) > Integer.parseInt(nums[j])){
                        String temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
            if (!swapped)
                break;
        }
    }
}
