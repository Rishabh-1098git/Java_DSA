package LeetCode_POTD;

import java.lang.reflect.Array;
import java.util.Arrays;

class KthLargest {
    int k ;
    int[] nums;


    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2};
        int k = 3;

        KthLargest kth = new KthLargest(k, arr);

        kth.add(3);
        kth.add(5);
        kth.add(10);
        kth.add(9);
        kth.add(4);
    }
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;

        System.out.println("k: "+ k);
        System.out.println("nums: "+ Arrays.toString(nums));
    }

    public int add(int val) {
        int [] arr = new int[this.nums.length+1];

        for(int i = 0; i<this.nums.length; i++){
            arr[i] = this.nums[i];
        }
        arr[this.nums.length] = val;

        // now we will sort the array -->>

        int n = arr.length;

        mergeSort(arr, 0, n-1);


        nums = arr;

        int ans;

//        if(arr[k-1] != arr[k-2]){
//            ans = arr[n-k];
//        }
//        else{
            ans = nums[n-k];
//        }

        System.out.println("added : "+ val+",  arr : " + Arrays.toString(arr) +  ",   ans = " + ans);

        return ans;

    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Function to merge two subarrays
    private static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        // Merge the temporary arrays

        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;

        // Initial index of the merged array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

