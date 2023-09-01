package Maths.Bit_Manipulation;

public class _12_XOR_bw_a_Range {
    public static void main(String[] args) {
        // XOR bw a range ==>
        int a=3;
        int b=9;
        System.out.println(xor(a,b)^xor(0,a-1));
    }
    static int xor(int a,int b){
        int xor=0;
        if(b%4 == 0) xor=b;
        else if (b%4==1) xor=1;
        else if (b%4==2) xor=b+1;
        else if (b%4==3) xor=0;
        return xor;
    }
}
