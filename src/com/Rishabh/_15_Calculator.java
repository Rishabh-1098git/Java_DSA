package com.Rishabh;
import java.util.Scanner;

public class _15_Calculator {

    public static void main(String[] args) {
        // taking operator as an input
        Scanner sc= new Scanner(System.in);
        while(true) {
            int ans=0;
            // taking operator as an input
            System.out.print("Enter operator: ");
            char in = sc.next().trim().charAt(0);
            if (in == '+' || in == '-' || in == '*' || in == '/' || in == '%') {
                System.out.println("Enter number 1: ");
                int num1=sc.nextInt();
                System.out.println("Enter number 2: ");
                int num2=sc.nextInt();
                if (in == '+') {
                        ans= num1+num2;
                }
                if (in == '-') {
                    ans= num1-num2;
                }
                if (in == '*') {
                    ans= num1*num2;
                }
                if (in == '/') {
                    if (num2!=0){
                        ans=num1+num2;
                    }
                    else{
                        System.out.println("Cannot divide by zero.!");
                    }
                }
                if(in=='%'){
                    ans=num1%num2;
                }
                System.out.printf("Answer %d",ans);
                System.out.println();
            }

            else if(in=='x'|| in=='X'){
                    System.out.println("Exiting the calculator");
                    break;
                }
            else{
                    System.out.println("Invalid Operation!!");
                }


        }


    }
}
