package Arrays.Binary_Search;

import java.util.Arrays;

public class _12_Count_No_of_Rotation_in_Array {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(countRotation(arr));
    }

     static int countRotation(int[] arr) {
            if(findPivot(arr)!=-1){
                return findPivot(arr)+1;
            }
            return -1;
    }
    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            // 4 cases
            // case-1
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case-2
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case-3
            if (arr[s] >= arr[mid]) {
                e = mid - 1;
            }
            // case-4
            else if (arr[s] < arr[mid]) {
                s = mid + 1;
            }
        }
        return -1;
    }

}