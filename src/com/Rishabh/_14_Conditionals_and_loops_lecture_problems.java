package com.Rishabh;
import java.util.Scanner;

public class _14_Conditionals_and_loops_lecture_problems {
    public static void main(String[] args) {

        // que1 --> Largest of three numbers
        Scanner sc= new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();

//        if (a>b && b>c){
//            System.out.println(a);
//        }
//        else if (b>c && c>a) {
//            System.out.println(b);
//        }
//        else if(c>b && b>a){
//            System.out.println(c);
//        }

        //------------------------------------------------------------------------------
//        int max = a; // let
//
//        if (b>max){
//            max = b;
//        }
//        if(c>max){
//            max =c;
//        }
//
//        System.out.println(max);

        //-------------------------------------------------------------
        // using math class

//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);

//        // que2 --> to check for upper case or lower case
//
//        char ch = sc.next().trim().charAt(0);
//
//        if(ch>='a' && ch<='z'){
//            System.out.println("Lower Case");
//        }
//        else{
//            System.out.println("Upper Case");
//        }

//        // que3 --> to print fibonacci series
//        // 0 1 1 2 3 5 8 13 21 34 55 ...........
//
//        System.out.println("Enter no of fibonacci terms to print: ");
//        int n = sc.nextInt();
//        int f1 = 0;
//        int f2 = 1;
//        int i = 1;
//
//        System.out.print(f1);
//        System.out.print(" ");
//        System.out.print(f2);
//        System.out.print (" ");
//
//        while(i<=n-2){
//            System.out.print(f1+f2);
//            System.out.print(" ");
//            int f3 = f1;
//             f1 = f2;
//             f2 = f2+f3;
//             i++;
//        }

//        // que 4 --> Count the number of Occurences of a digit in a number.
//        // Method-1
//        System.out.println("Enter the big number: ");
//        String n = sc.next();
//        System.out.println("Enter the digit: ");
//        char d = sc.next().trim().charAt(0);
//
//        int a = n.length();
//        int count=0;
//        for(int i=0; i<a;i++){
//            if (n.charAt(i)==d){
//                    count++;
//            }
//        }
//        System.out.printf("No of %s in %s are: %d ",d,n,count);
//
//----------------------------------------------------------------------------------------
        //Method-2

//        System.out.println("Enter the bigger number: ");
//        int n= sc.nextInt();
//        int a = n;
//        System.out.println("Enter the number to count: ");
//        int b= sc.nextInt();
//
//        int count=0;
//
//        while(n>0){
//            int rem = n%10;
//            if (rem==b){
//                count++;
//            }
//            n=n/10;
//        }
//        System.out.printf("No of %d in %d are: %d ",b,a,count);

// -----------------------------------------------------------------------------------------

        // que5 --> reverse a number

        int n = sc.nextInt();
        int t = n;
        int z=0;

        while(n>0){
            int rem = n%10;
            n/=10;
            z = z*10+rem;
        }
        System.out.printf("Reverse of %d is %d.",t,z);









    }

}
