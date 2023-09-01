package com.Rishabh;

import java.util.Scanner;
public class _04_CBSE_percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("CBSE Percentage Calculator");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject 1: ");
        float m1 = sc.nextFloat();

        System.out.print("Enter marks in subject 2: ");
        float m2 = sc.nextFloat();

        System.out.print("Enter marks in subject 3: ");
        float m3 = sc.nextFloat();

        System.out.print("Enter marks in subject 4: ");
        float m4 = sc.nextFloat();

        System.out.print("Enter marks in subject 5: ");
        float m5 = sc.nextFloat();

        float sum = m1+m2+m3+m4+m5;

        float percentage = (sum/500)*100;

        System.out.println("Your total percentage is : "+percentage+"% ");
    }
}
