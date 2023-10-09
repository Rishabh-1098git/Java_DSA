package Recursion.Sorting;

import java.util.Arrays;

public class _02_Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        mergeSort2(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort2(int[]arr,int s, int e){
        if(e-s==1){
            return;
        }

        int mid = (s+e)/2;

        mergeSort2(arr,s,mid);
        mergeSort2(arr,mid,e);

        merge(arr,s, mid, e);
    }

    static void merge(int[] arr, int s,int mid,int e){
        int[] mix = new int[e-s];

        int i=s;
        int j=mid;
        int k=0;

        while(i<mid && j<e){
            if(arr[i]>arr[j]){
                mix[k] = arr[j];
                j++;
            }
            else{
                mix[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i< mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l= 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
