package Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int [] arr = {5,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        int n = arr.length;
        while(i<n){
            if(i == arr[i]-1){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


    // Practice Questions
    // 1. https://leetcode.com/problems/missing-number/
    // 2. https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    // 3. https://leetcode.com/problems/set-mismatch/
    // 4. https://leetcode.com/problems/find-the-duplicate-number/
    // 5. https://leetcode.com/problems/find-all-duplicates-in-an-array/
    // 6. https://leetcode.com/problems/first-missing-positive/
}
