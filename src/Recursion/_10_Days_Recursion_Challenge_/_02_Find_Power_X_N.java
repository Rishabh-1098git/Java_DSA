package Recursion._10_Days_Recursion_Challenge_;

public class _02_Find_Power_X_N {
    public static void main(String[] args) {
        System.out.println(Pow(2,4));
    }
    public static long Pow(int X, int N) {
        if(N==0){
            return 1;
        }
        return X*Pow(X, N-1);
    }
}
