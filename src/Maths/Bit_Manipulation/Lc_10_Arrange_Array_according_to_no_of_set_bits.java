package Maths.Bit_Manipulation;

import java.util.ArrayList;

public class Lc_10_Arrange_Array_according_to_no_of_set_bits {
    public static void main(String[] args) {
//       arr = [0,1,2,3,4,5,6,7,8]
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" "+count_1bits(arr[i]));
            maxi = Math.max(maxi,count_1bits(arr[i]));
        }
        // now we have maximum bits
         ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <=maxi ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(count_1bits(arr[j])==i){
                    list.add(arr[j]);
                }
            }
        }

        System.out.println(list);
    }
    static int count_1bits(int n) {
        int count = 0;
        while (n > 0) {
            int lsb = n & 1;
            if (lsb == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}

