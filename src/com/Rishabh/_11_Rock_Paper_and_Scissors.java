package com.Rishabh;

import java.util.Random;
import java.util.Scanner;

public class _11_Rock_Paper_and_Scissors {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper and Scissors Game.");
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissors");

        Random rd = new Random();
        int ci = rd.nextInt(1,4);

        Scanner sc = new Scanner(System.in);
        int pi = sc.nextInt();

        if(pi==1){
            System.out.println("Your choice is Rock.");
        }
        else if (pi==2) {
            System.out.println("Your choice is Paper.");
        }
        else if (pi==3) {
            System.out.println("Your choice is Scissors");
        }
        else{
            System.out.println("Please enter valid int bw 1-3");
        }

        if(ci==1){
            System.out.println("Computer choice is Rock.");
        }
        else if (ci==2) {
            System.out.println("Computer choice is Paper.");
        }
        else if (ci==3) {
            System.out.println("Computer choice is Scissors");
        }



        if(ci==pi){
            System.out.printf("Computer choice is %d",ci);
            System.out.println();
            System.out.println("Its a Tie!!");
        }
        else if ((ci==1 && pi==2)||(ci==2 && pi==3)||(ci==3 && pi==1)) {
            System.out.println("You wins!!");
        }
        else if((ci==2 && pi==1)||(ci==3 && pi==2)||(ci==1 && pi==3)){
            System.out.println("Computer wins!!");
        }
        else{
            System.out.println("Try again with valid input!");
        }

    }

}
