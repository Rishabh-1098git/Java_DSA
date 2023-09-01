package com.Rishabh;

public class _19_Methods_2 {
    public static void main(String[] args) {
        int a =10;
        int b=20;

//      this will swap it
//      int temp = a;
//      a= b;
//      b= temp;

        swap(a,b); // it didn't swap it --> to understand it we need to know how values are passed in method3 file
        System.out.println(a+" "+b);

        String name = "Rishabh Saini";
        ChangeName(name); // didn't change the name
        System.out.println(name);
    }

    private static void ChangeName(String naam) {
        naam = "__Bruce Wayne 1098__"; // new object is created
    }

    // Function to swap two numbers
    static void swap(int a,int b){
        int temp = a;
        a= b;
        b= temp;
    }


}
