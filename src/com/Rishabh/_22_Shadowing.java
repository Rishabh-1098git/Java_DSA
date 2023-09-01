package com.Rishabh;

public class _22_Shadowing {
    // this will have scope in whole _22_Shadowing class
    static int x = 90;// this will be shadowed at line 10

    public static void main(String[] args) {
        System.out.println(x);
        int x;
//      System.out.println(x); // scope will begin when value is initialised
        x = 50;
        System.out.println(x);
        fun();
    }

    static void fun() {

        System.out.println(x);
    }

}