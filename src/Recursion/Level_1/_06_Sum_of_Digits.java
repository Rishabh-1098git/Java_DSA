package Recursion.Level_1;

public class _06_Sum_of_Digits {
    public static void main(String[] args) {
        int n = 1098;
        System.out.println(sum_digits(n));
    }
    static int sum_digits(int n){
        if(n/10 == 0){
            return n;
        }
        return (n%10)+sum_digits(n/10);
    }
}
