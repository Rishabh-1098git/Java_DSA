package DynamicProgramming;
import java.util.Arrays;

public class _01_Fibbonaci {

    static int fibo(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!= -1) return dp[n];
        return dp[n]= fibo(n-1,dp) + fibo(n-2,dp);
    }
    static int fibo1(int n){
        if(n<=1) return n;

    return fibo1(n-1) + fibo1(n-2);
    }

    public static void main(String[] args) {
        int n=30;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));
//        int n = 50;
//        System.out.println(fibo1(n));

    }
}
