package Arrays.Binary_Search;

public class _03_Pr1_Ceiling_of_a_number {
    public static void main(String[] args) {
//        https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    // Ceiling -->The smallest element in array greater or equal to target element.
     int[] arr = {2,3,5,9,14,16,28};
     int target = 15;
     int ans = ceiling(arr,target);
     System.out.println(ans);
    }

    static int  ceiling(int[] arr, int target) {
        // what if target is the largest number in the array
        if(target>arr[arr.length-1]){
            return -1 ;
        }
        int s =0;
        int e =arr.length-1;
        int mid=0;
        while(s<=e){
             mid = s + (e-s)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return arr[s];
    }


}
