package Maths.Bit_Manipulation;

public class Lc_05_hasAlternatebits {
    public static void main(String[] args) {
        int n =11;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(hasAlternative(n));
    }
    static boolean hasAlternative(int n){
        int temp1=-1;
        int temp2=-1;
        while(n>0){
            temp1 = n&1; // stores last digit =>
            n = n>>1;
            temp2 = n&1;
            if(temp1==temp2){
                return false;
            }
        }
        return true;
    }
}
