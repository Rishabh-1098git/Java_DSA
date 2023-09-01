package com.Rishabh;

public class _06_Precedence_and_associativity {
    public static void main(String[] args) {

        // Associativity and Precendence

        int a = 12+3*4/2;
        System.out.println(a);

        // Quick quiz

        int x =10;
        int y=2;
        int z=3;

        System.out.println((x-y)/2);
        System.out.println(((y*y)-(4*x*z))/2*x);

        System.out.println((x*x)-(y*y));
        System.out.println((x*y)-z);

    }
}
