package Maths.Maths2;
import java.util.Scanner;
public class _01_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isprime1(n));
        System.out.println(isPrime2(n));
    }
    static boolean isprime1(int n){
        if(n<=1){
            return false;
        }
        boolean ans = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                ans = false;
                break;
            }
        }
        return ans;
    }
    static boolean isPrime2(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
