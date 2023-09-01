package Maths.Bit_Manipulation;

public class _03_Find_ith_Bit {
    public static void main(String[] args) {
        System.out.println(ith_bit(24,4));
        System.out.println(ith_bit(24,3));
        System.out.println(ith_bit(24,4));
    }
    static int ith_bit(int n, int i){
        int a = n>>(i-1);
        int ans = a&1;

        return ans;
    }
}
