package DynamicProgramming;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Problem_1671 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1,1,2,3,1};

        minimumMountainRemovals(nums);

    }
    public static int minimumMountainRemovals(int[] nums) {
        int[][] dp1 = new int[nums.length+1][nums.length+1];
        for(int i=0; i<dp1.length; i++){
            Arrays.fill(dp1[i], -1);
        }


        int[] LIS = new int[nums.length];

        for(int i=0; i<LIS.length; i++){
            LIS[i] = helper1(nums, -1, i,dp1);
        }

        System.out.println("LIS : " + Arrays.toString(LIS));


        int[][] dp2 = new int[nums.length+1][nums.length+1];
        for(int i=0; i<dp2.length; i++){
            Arrays.fill(dp2[i], -1);
        }


        int[] LDS = new int[nums.length];

        for(int i=0; i<LIS.length; i++){
            LDS[i] = helper2(nums, -1, i,dp2);
        }

        System.out.println("LDS : " + Arrays.toString(LDS));

        int max = -1;

        for(int i=0; i<LIS.length; i++){
            if (LIS[i] > 1 && LDS[i] > 1) {
                max = Math.max(max, LIS[i] + LDS[i] - 1);
            }
        }

        return nums.length - max;


    }

    static int helper1(int[] arr, int prevIndex, int currentIndex, int[][] dp) {
        // Base case: if we have processed all elements
        if (currentIndex == arr.length) {
            return 0;
        }

        // Check if the result is already computed
        if (dp[currentIndex][prevIndex + 1] != -1) return dp[currentIndex][prevIndex + 1];

        int take = 0;
        // Include currentIndex if it is greater than the previous index
        if (prevIndex == -1 || arr[prevIndex] < arr[currentIndex]) {
            take = 1 + helper1(arr, currentIndex, currentIndex + 1, dp);  // Take the current element
        }
        // Do not include the currentIndex and move to the next index
        int notTake = helper1(arr, prevIndex, currentIndex + 1, dp);  // Skip the current element

        // Store the result in dp array and return
        return dp[currentIndex][prevIndex + 1] = Math.max(take, notTake);
    }

    static int helper2(int[] arr, int prevIndex, int currentIndex, int[][] dp){
        if(currentIndex == arr.length){
            return 0;
        }

        if(dp[currentIndex][prevIndex+1] != -1) return dp[currentIndex][prevIndex+1];

        int take = 0;
        if(prevIndex==-1 || arr[prevIndex] > arr[currentIndex]){
            take = 1 + helper2(arr, currentIndex, currentIndex+1, dp);
        }
        int notTake = helper2(arr, prevIndex, currentIndex+1, dp);

        return dp[currentIndex][prevIndex+1] = Math.max(take, notTake);
    }
}
