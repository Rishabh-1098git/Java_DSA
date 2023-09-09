package Maths.Maths2;

import java.util.Arrays;

public class LC_01_next_greater_element {
    public static void main(String[] args) {
        int n = 6537421;
        int digits = (int)Math.log10(n);
        int[]arr = new int[digits+1];
        int num= n;
        int count=0;
        while(digits>=0){
            int rmd = num/(int)Math.pow(10,digits);
            arr[count] = rmd;
            num = num - rmd*(int)Math.pow(10,digits);
            digits--;
            count++;
        }
        System.out.println(Arrays.toString(arr));
        int temp_index = -1;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]){
                swap(arr,i,nextGreaterElement(arr,i));
                temp_index = i;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(nextGreaterElement(arr, 2));

    }
    static int nextGreaterElement(int[] arr,int s){
        int mini = Integer.MAX_VALUE;
        int temp = s;
        int index = -1;
        for (int i = s+1; i <= arr.length-1 ; i++) {
            if(arr[i]>temp){
                mini = Math.min(mini, arr[i]);
                index = i;
            }
        }
        return index;
    }
    static int min_value(int[]arr,int s){
        int mini = Integer.MAX_VALUE;
        int index = -1;
        for (int i = s; i < arr.length ; i++) {
            mini = Math.min(mini, arr[s]);
        }
        return mini;
    }
     static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
