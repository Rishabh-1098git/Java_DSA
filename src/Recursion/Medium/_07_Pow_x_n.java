package Recursion.Medium;

public class _07_Pow_x_n {
    public static void main(String[] args) {
        System.out.println(power(232,345));
    }
    static long power(int x, int y){
        if(y==0){
            return 1;
        }
        long ans = power(x,y/2);
        ans*=ans;
        ans %= (long) (1e9+7);
        if(y%2!=0){
            ans *= x;
        }
        return ans;
    }
}
