package Recursion.Sheet.Easy;

import java.util.Scanner;
public class _05_Special_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(newfibo1(a,b,n));
        }

    }
    static int newfibo(int a, int b, int n){
        if(n==0){
            return a;
        }
        if(n==1){
            return b;
        }
        return newfibo(a,b,n-2)^newfibo(a,b,n-1);
    }

    static int newfibo1(int a, int b, int n){
        if(n%3==0) return a;
        else if (n%3==1) return b;
        else return a^b;
    }
}
