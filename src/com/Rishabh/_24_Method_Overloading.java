package com.Rishabh;

public class _24_Method_Overloading {
    public static void main(String[] args) {
        fun(3);
        fun("Rishabh");
    }

    // first pairs of overloaded functions
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }

    // Second pair of overloaded function
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }





}
