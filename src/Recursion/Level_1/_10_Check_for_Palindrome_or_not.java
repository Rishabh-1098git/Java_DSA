package Recursion.Level_1;
public class _10_Check_for_Palindrome_or_not {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }
    static int reverse2(int n){
        if(n==0){
            return n;
        }
        int digits = (int)Math.log10(n);
        int rem = n%10;
        return rem*(int)Math.pow(10,digits)+reverse2(n/10);
    }

    static boolean isPalindrome(int n){
        return reverse2(n)==n;
    }

}
