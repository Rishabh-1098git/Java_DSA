package Maths.Bit_Manipulation;

public class _11_XOR_of_numbers_till_n {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("XOR : "+xor(n));
        if(n%4 == 0) System.out.println(n);
        else if (n%4==1) System.out.println(1);
        else if (n%4==2) System.out.println(n+1);
        else if (n%4==3) System.out.println(0);
    }
    static int xor(int n){
        int xor=0;
        for (int i = 0; i <=n ; i++) {
            xor^=i;
        }
        return xor;
    }
}
