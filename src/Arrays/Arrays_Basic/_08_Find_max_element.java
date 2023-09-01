package Arrays.Arrays_Basic;

import java.util.Arrays;

public class _08_Find_max_element {
    public static void main(String[] args) {
        int[] arr = {23,45,223,1234,5412,345,234,657,2324};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));

    }

    static int max(int[] nums){
        int maxi = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        return maxi;
    }


    }

