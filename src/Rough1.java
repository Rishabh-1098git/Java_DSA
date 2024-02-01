import java.util.*;

public class Rough1 {
    static int minLength = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[] nums = {1,4,3,1};
        minimumArrayLength(nums);

        System.out.println(minLength);

    }
    public static int minimumCost(int[] nums) {
        int min = nums[0];

        int temp = Integer.MAX_VALUE;
        for (int j = 1; j < nums.length-1 ; j++) {
            for (int i = j; i < nums.length -1 ; i++) {
                temp = Math.min(temp, nums[j]+nums[i+1]);
            }
        }


        return min+temp;
    }
    // _02_contest
    public static boolean canSortArray(int[] arr) {
        int n=arr.length;

        boolean swapped = false;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                if(arr[j]<arr[j-1] && (count_1bits(arr[j])== count_1bits(arr[j-1]))){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return isSorted(arr);
    }
    static boolean isSorted(int[] arr){
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
    static int count_1bits(int n){
        int count=0;
        while(n>0){
            int lsb = n&1;
            if(lsb==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }



    public static void minimumArrayLength(int[] nums) {
        if(allZeroes(nums)){
            return;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }


        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[i]>0 && nums[j]>0){
                    flag = true;
                    int result = nums[i] % nums[j];
                    list.add(result);
                    list.remove(i);
                    if(i<j){
                        j = j-1;
                    }
                    list.remove(j);
                }
                minLength = Math.min(minLength, list.size());
                int[] temp = new int[list.size()];
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = list.get(k);
                }
                minimumArrayLength(temp);
            }
        }

    }

    private static boolean allZeroes(int[] nums) {
        boolean isAllZeroes = true;
        for (int num : nums) {
            if (num != 0) {
                isAllZeroes = false;
                break;
            }
        }
        return isAllZeroes;
    }

}

