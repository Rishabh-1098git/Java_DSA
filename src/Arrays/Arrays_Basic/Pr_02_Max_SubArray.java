package Arrays.Arrays_Basic;

public class Pr_02_Max_SubArray {
    public static void main(String[] args) {
//        num = [-2,1,-3,4,-1,2,1,-5,4]
// ----------------------------------------------------------------------------------------
//  Brute Force Approach ->
/*
        int[] arr = {1};
        int sum=0;
        int max1=Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                sum=0;
                for (int k = i; k <=j; k++) {
                    sum+=arr[k];
                }
                max1 = Math.max(sum,max1);
            }
            
        }
        System.out.println(max1);
 */

// ----------------------------------------------------------------------------------------
// Better Approach ->
/*
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int max1=Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            sum=0;
            for (int j = i; j <n ; j++) {
                sum+=arr[j];
                max1 = Math.max(sum,max1);
            }

        }
        System.out.println(max1);
*/
//-------------------------------------------------------------------------------------------
// Optimal Approach --> Kadane's Algorithm
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
             sum+=arr[i];
             if(sum<0){
                 sum=0;
             }

        }
        System.out.println(sum);
    }

}
