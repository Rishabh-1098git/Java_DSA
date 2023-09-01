package com.Rishabh;

public class _07_Resulting_Datatype {

    public static void main(String[] args) {

        byte a =5;
        int b = 6;
        short c= 7;

        int r1= b+c;       //convert r1 into a int
        System.out.println(r1);
        int r2 = c+b;     // convert r2 into a int
        System.out.println(r2);
        float r3 = 3.45f+b; // convert r3 into a float
        System.out.println(r3);


        // Increment and Decrement Operators

        int x = 10;
        // x++ first use then increment
        System.out.println(x++);
        System.out.println(x);
        // ++x first increment and then use
        System.out.println(++x);
        System.out.println(x);


        // quick quiz
         int y=7;
         int z= ++y*8;
        System.out.println(z);

        char t = 'A';
        System.out.println(++t); // increment A to B


    // Practice set important Questions
        // que1
        float a1 = 7/4*9/2;
        System.out.println(a1); // answer came to be 4.0
        // bcz 7/4 gives integer 1 and (1*9)/2 gives 4 which is further type casted in float.

        float a2 = 7/4.0f*9/2.0f;
        System.out.println(a2); // answer which we were accepting came when we convert them into
                                // float at each operation.

        //que2
        // Encrypting
        char grade= 'A';
        grade = (char)(grade+8);
        // Decrypting
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.println(grade);

    }

}
