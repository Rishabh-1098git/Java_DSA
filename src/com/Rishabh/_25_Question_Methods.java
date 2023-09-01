package com.Rishabh;

public class _25_Question_Methods {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime1(2));
        Armstrong();
    }

    // write a function to check whether given number is prime or not
    static boolean isPrime(int a) {
        boolean r = true;
        for (int t = 2; t != a; t++) {
            if (a % t == 0) {
                r= false;
            }
        }
        return r;
    }

    // Another method to check for prime number
    static boolean isPrime1(int a){
        if (a<=1){
            return false;
        }
        int c=2;
        while(c*c<=a){
            if (a%c==0){
                return false;
            }
            c++;
        }
        return c*c>a;
    }

    // Print all the three Armstrong numbers
    static void Armstrong(){
        int n = 100;
        for(int i=n;i<1000;i++){
            int r=0;
            int t=i;
            while(t!=0){
                int rem=t%10;
                r = r +rem*rem*rem;
                t=t/10;
            }
            if(i==r){
                System.out.print(i+" ");
            }
        }
    }




}

