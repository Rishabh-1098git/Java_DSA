package Recursion.Sheet.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1_Sum_Triangle {
    public static void main(String[] args) {
        long[] arr = {4, 7, 3, 6, 7};
        long n = arr.length;
        long[] ans = new long[(int) (n*(n+1)/2)];
        sumTriangle(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(ans));
    }
    static ArrayList<Long>list = new ArrayList<>();
    static void sumTriangle(long [] arr){
        if(arr.length==1){
            return;
        }
        long []ans = new long[arr.length-1];
        for (int i = 0; i < arr.length-1 ; i++) {
            ans[i] = arr[i]+arr[i+1];
        }
        sumTriangle(ans);
        System.out.println(Arrays.toString(ans));
    }
}
