package Arrays.Arrays_Basic;

import java.util.Arrays;

public class Pr_06_Sort_Color_1 {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        // to sort an Array
        int twos=0;
        int zeros=0;
        int ones=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                zeros++;
            }
            else if (arr[i]==1){
                ones++;
            }
            else {
                twos++;
            }
        }

        for (int i = 0; i <zeros ; i++) {
            arr[i]=0;
        }
        for (int i = zeros; i <zeros+ones ; i++) {
            arr[i]=1;
        }
        for (int i =zeros+ones ; i <zeros+ones+twos ; i++) {
            arr[i]=2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
