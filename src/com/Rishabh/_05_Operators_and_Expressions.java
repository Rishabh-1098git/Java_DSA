package com.Rishabh;

public class _05_Operators_and_Expressions {
    public static void main(String[] args) {

        // Operators
        int a=10;
        int b = a+12;
        System.out.println(b);

        int c = b%12; // gives remainder
        System.out.println(c);

        b*=2; // b=b*2
        System.out.println(b);

        b++;  // increment by 1
        System.out.println(b);

        // Comparison Operators
        System.out.println(64<=34); // gives boolean false
        System.out.println(12==12);
        System.out.println(13>7);

        // Logical Operators
        System.out.println(1==1 && 4>19); // true and false = false
        System.out.println(1==1 || 4>19); // true or false = true
        System.out.println(1!=2); //true



    }
}
