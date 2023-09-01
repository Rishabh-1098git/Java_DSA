package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
            int []arr = {1,55,44,33,22};
            selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr) {
        int start=0;
        for (int i = 0; i <arr.length ; i++) {
            int end= arr.length-i-1;
            swap(arr,end,get_max_index(arr,start,end));
        }
    }

    static void swap (int[] arr, int a, int b){
        int temp = arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    static int get_max_index(int[]arr,int start, int end) {
        int maxi = start;
        for (int i = start; i <= end ; i++) {
            if(arr[i]>arr[maxi]){
                maxi = i;
            }
        }
        return maxi;
    }

}
