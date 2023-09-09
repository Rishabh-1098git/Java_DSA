package Recursion.Sheet.Easy;

import java.util.Arrays;

public class Q2_Minimum_andMaximum_Element_in_Array {
    public static void main(String[] args) {
        long[] arr = {1, 345, 234, 21, 56789};
        long [] a = {Integer.MAX_VALUE, Integer.MIN_VALUE};

        System.out.println(Arrays.toString(answer(arr,a,0)));

    }
    static long[] answer(long a[],long[] ans ,int i){
        if(i==a.length){
            return ans;
        }
        ans[0] = Math.min(ans[0], a[i]);
        ans[1] = Math.max(ans[1], a[i]);
        return answer(a, ans, i+1);
    }
}
