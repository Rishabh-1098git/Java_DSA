package Recursion.Recursion_Pattern_Problems;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,5,7,6};
        selection_sort(arr,0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[]arr,int c, int r, int maxi){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[maxi]){
                selection_sort(arr,c+1,r,c);
            }
            else{
                selection_sort(arr,c+1,r,maxi);
            }
        }
        else{
            swap(arr,r-1,maxi);
            selection_sort(arr,0,r-1,0);
        }
    }
    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
