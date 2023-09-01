package Arrays.Binary_Search;

import java.util.Arrays;

public class _06_Pr4_First_and_last_Position {
    public static void main(String[] args) {
        // nums = [5,7,7,8,8,10] --> target= 8;
// ------------------------------------------------------------
/*
        // Brute Force solution with O(N) complexity
        int[] arr = {5,7,7,7,7,7,8,8,10};
         int s=0;
         int e=arr.length-1;
         int target = 10;
         int[] ans = new int[2];
         while (s<arr.length){
             if(arr[s]==target){
                 ans[0]=s;
                 break;
             }
             s++;
         }
        while (e>=0){
            if(arr[e]==target){
                ans[1]=e;
                break;
            }
            e--;
        }
        System.out.println(Arrays.toString(ans));

 */
//---------------------------------------------------------------
        int[] arr = {5,7,7,7,7,7,8,8,10};
        int target = 7;
        int[] a= searchRange(arr, target);
        System.out.println(Arrays.toString(a));
    }

    public static int[] searchRange(int[] arr, int target ){
            int[] ans = {-1,-1};
            ans[0] =  search(arr, target, true);
            if (ans[0]!=-1){
               ans[1] = search(arr, target, false);
            }
            return ans;
    }

    static int search(int[] arr,int target, boolean isFirstOccurence){
        int ans= -1;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target>arr[mid]){
                s = mid+1;
            }
            else if (target<arr[mid]){
                e = mid-1;
            }
            else{
                ans = mid;
                if(isFirstOccurence){
                    e= mid-1;
                }
                else {
                    s = mid+1;
                }
            }
        }
        return ans;
    }
}
