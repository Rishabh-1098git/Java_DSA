package com.Rishabh;

import java.util.Scanner;

public class _10_Conditionals_in_JAVA {
    public static void main(String[] args) {

//        // If else statements
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        if(age>=18){
//            System.out.println("You can vote!!");
//        }
//        else{
//            System.out.println("You cannot vote stupid minor!!");
//        }



//        // else if ladder
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        if(age<13){
//            System.out.println("You are cannot drive!!");
//        }
//        else if (age>=13 && age<18) {
//            System.out.println("You can drive non gear vehicles!!");
//        }
//        else {
//            System.out.println("You can drive anything!!");
//        }

        // Switch Case --> is used when we to make a choice b/w number of alternatives
        //                 for a given no of alternatives.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int var = sc.nextInt();

//        switch (var){
//            case 18:
//                System.out.println("You are going to be an adult!!");
//                break;
//            case 22:
//                System.out.println("You are going to get a job!!");
//                break;
//            case 28:
//                System.out.println("You are going to get married!!");
//                break;
//            case 60:
//                System.out.println("You are going to get retired!!");
//                break;
//            default:
//                System.out.println("Enjoy your life baby!!");
//                break;
//        }
//        System.out.println("Outside Switch!! ");

        // Enhanced switch

        switch (var) {
            case 18 -> System.out.println("You are going to be an adult!!");
            case 22 -> System.out.println("You are going to get a job!!");
            case 28 -> System.out.println("You are going to get married!!");
            case 60 -> System.out.println("You are going to get retired!!");
            default -> System.out.println("Enjoy your life baby!!");
        }


    }
}
