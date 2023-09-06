package Recursion.Level_1;

public class _05_Sum_of_N_natural_numbers {
    public static void main(String[] args) {
        System.out.println("Sum: "+sum(5));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
