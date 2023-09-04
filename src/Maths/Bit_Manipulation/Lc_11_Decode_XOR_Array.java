package Maths.Bit_Manipulation;

import java.util.Arrays;

public class Lc_11_Decode_XOR_Array {
    public static void main(String[] args) {
//        arr = [1,0,2,1]
//        encoded = [1,2,3]
        int start = 4;
        int [] encoded = {6,2,7,3};
        int [] decoded = new int[encoded.length+1];
        int c=0;
        decoded[c] = start;
        for(int i=1;i<decoded.length;i++){
            int prev = encoded[c]^decoded[c++];
            decoded[i] = prev;
        }
        System.out.println(Arrays.toString(decoded));
    }
}
