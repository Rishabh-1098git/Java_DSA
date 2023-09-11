package Recursion.Sheet.Easy;
//  Write a recursive function for given n and a to determine x:
//   n = a ^ x
//   a = 2, 3, 4
//   (2 ^ -31) <= n <= (2 ^ 31) - 1
public class Power_of_Base {
    public static void main(String[] args) {
            int n = 256;
            int a = 2;
        System.out.println(power(n,a,0));
    }
    static int power(int n, int a, int x){
        if(n == (int)Math.pow(a,x)){
            return x;
        }
        return power(n,a,x+1);
    }
}
