import java.util.Arrays;
import java.util.Scanner;

public class Rough1 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
//        System.out.println(Arrays.toString(nums));
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int [] ans = new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        System.out.println(Arrays.toString(left));
        for(int i=nums.length-1;i>0;i--){
            right[i-1] = right[i]*nums[i];
        }
        System.out.println(Arrays.toString(right));
        for(int i=0;i<nums.length;i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}

