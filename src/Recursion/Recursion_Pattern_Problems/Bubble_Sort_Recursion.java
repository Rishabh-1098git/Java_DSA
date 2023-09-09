package Recursion.Recursion_Pattern_Problems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble_Sort_Recursion {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,5,7,6};
        bubble_sort(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int[] arr, int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                swap(arr,c,c+1);
            }
            bubble_sort(arr,r,c+1);
        }
        else {
            bubble_sort(arr,r-1,0);
        }
    }
    static void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
