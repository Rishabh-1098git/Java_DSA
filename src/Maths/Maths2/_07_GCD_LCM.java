package Maths.Maths2;
public class _07_GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(15,108));
        System.out.println(lcm(12,3));
    }
    // Euclid's Algorithm
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
