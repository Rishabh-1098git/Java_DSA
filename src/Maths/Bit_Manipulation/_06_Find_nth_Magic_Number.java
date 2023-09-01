package Maths.Bit_Manipulation;

public class _06_Find_nth_Magic_Number {
    public static void main(String[] args) {
        int n = 4;
        int ans =0;
        int i = 1;
        while(n>0){
            int last = n&1; // gives last bit
            ans+=last*Math.pow(5,i++);
            n = n>>1;
        }
        System.out.println(ans);
    }
}
