package Recursion.Level_1;

public class _03_Print_N_to_1_and_1_to_N {
    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}
