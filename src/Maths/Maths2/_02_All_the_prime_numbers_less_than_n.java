package Maths.Maths2;
import java.util.Scanner;
public class _02_All_the_prime_numbers_less_than_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            if(isPrime2(i)){
                System.out.print(i+" ");
            }
        }
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
