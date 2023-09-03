package Maths.Bit_Manipulation;

public class Lc_06_prime_set_bits {
    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        int count=0;
        for(int i=left;i<=right;i++){
            System.out.println(countSetBits(i));
            if(isPrime(countSetBits(i))){
                count++;
            }
        }
        System.out.println(count);
    }
    static int countSetBits(int n){
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
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
