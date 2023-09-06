package Recursion.Level_1;
public class _09_Reverse_a_number {
    // Method --> 1
    static int reverseSum=0;
    static void  reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        reverseSum = reverseSum*10+rem;
        reverse(n/10);
    }

    // Method --> 2
    static int reverse2(int n){
        if(n==0){
            return n;
        }
        int digits = (int)Math.log10(n);
        int rem = n%10;
        return rem*(int)Math.pow(10,digits)+reverse2(n/10);
    }
    public static void main(String[] args) {
        reverse(12345);
//        System.out.println("Method 1 --> "+reverseSum);
        System.out.println("Method 2 --> "+reverse2(12345));
    }

}
