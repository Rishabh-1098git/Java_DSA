package com.Rishabh;

public class _21_Scope_of_variables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        System.out.println(num1);// cannot use a as it is out of scope of its methods

        {
//            int a = 20; // cannot reassign a because it is already assigned  in this method
            a = 101; // can change it as it is inside scope
            int c = 2020; // values initialised in this block will remain in this block
        }
//        System.out.println(c); //--> cannot use c here because it is out of the block


        // Scoping in for loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i); // i--> cannot be use i here bcz it's out of scope o
    }

    static void random(){
        int num1=30;
//        System.out.println(a);// cannot use a as it is out of scope of its methods
    }



    }


