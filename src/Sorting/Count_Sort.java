package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Count_Sort {
    public static void main(String[] args) {

        int[] arr = {1 ,5, 7 ,1 , 3, 4, 5, 2, 6, 7, 3, 7, 3};

        countSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));

    }
    public static void countSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        int[] countArray = new int[max + 1];

        for (int j : arr) {
            countArray[j]++;
        }

        int index = 0;

        for (int i = 0; i < max; i++) {

            while(countArray[i] > 0) {
                arr[i] =  i;
                index++;
                countArray[i]--;
            }

        }

//        System.out.println(Arrays.toString(countArray));
    }
}
