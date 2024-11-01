package LeetCode_POTD;


import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println("3".compareTo("30"));
        System.out.println(largestNumber(nums));

    }

    public static String largestNumber(int[] nums) {

        String [] strNums = new String[nums.length];

        for(int i=0; i<nums.length; i++){
            strNums[i] = "" + nums[i];
        }

        customBubbleSort(strNums);

        StringBuilder sb = new StringBuilder();

        for (String strNum : strNums) {
            sb.append(strNum);
        }

        return sb.toString();

    }

    public static void customBubbleSort(String[] nums){
            int n = nums.length;
            int i, j;
            String temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++) {
                swapped = false;
                for (j = 0; j < n - i - 1; j++) {
                    String first = nums[j] + nums[j+1];
                    String second = nums[j+1] + nums[j];
                    if (second.compareTo(first) > 0) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        swapped = true;
                    }
                }

                // If no two elements were
                // swapped by inner loop, then break
                if (!swapped)
                    break;
            }
    }


}
