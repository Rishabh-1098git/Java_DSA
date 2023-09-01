package com.Rishabh;

import java.util.Arrays;

public class _23_VarArgs {
    public static void main(String[] args) {
            fun(8,8,6,53,42,3,45,67);
            fun1(2,4,"Rishabh","Rashmika","Monica Belluci","Ana De Armas");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // multiple arguments
    static void fun1(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
