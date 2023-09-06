package Recursion.Level_1;

public class _01_Print_numbers_1_to_n {
    public static void main(String[] args) {
        printn(10);
    }
    static void printn(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printn(n-1);
    }
}
