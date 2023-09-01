package Recursion;
import java.util.Scanner;
public class _04_Fibonacci_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
//        System.out.println(Fibonacci(n));
        for (int i = 0; i <=n ; i++) {
            System.out.println(Fibonacci(i));
        }
    }

    private static int Fibonacci(int n) {
        // base conditions
        if(n==0 || n==1){
            return n;
        }
        else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

}
