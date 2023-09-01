package Arrays.Arrays_Basic;

import java.sql.Array;
import java.util.Arrays;

public class Pr_06_Sort_Color_2 {
    public static void main(String[] args) {
        int[] arr = {2,0,1,2,2,1,0};
        int start=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end){
            switch (arr[mid]){
                case 0:
                    swap(arr,start,mid);
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,end);
                    end--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


}
