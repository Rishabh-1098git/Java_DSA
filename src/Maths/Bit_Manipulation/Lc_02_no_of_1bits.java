package Maths.Bit_Manipulation;

import java.util.ArrayList;

public class Lc_02_no_of_1bits {
    public static void main(String[] args) {
//            int n = 100010010101001;
        int n = 15;
        System.out.println(count_1bits(15));

    }
    static int count_1bits(int n){
        int count=0;
        while(n>0){
            int lsb = n&1;
            if(lsb==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
