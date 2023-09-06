package Recursion.Level_1;

public class _04_Factorial_Of_a_Number {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
