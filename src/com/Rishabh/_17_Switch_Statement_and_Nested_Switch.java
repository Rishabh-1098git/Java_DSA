package com.Rishabh;
import java.util.Scanner;

public class _17_Switch_Statement_and_Nested_Switch {
    public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);


//    System.out.print("Enter fruit name: ");
//    String fruit = sc.next();
//
//    switch (fruit){
//        case "mango":
//            System.out.println("King of fruits");
//            break;
//        case "orange":
//            System.out.println("Citrus fruit");
//            break;
//        case "banana":
//            System.out.println("Rich in carbohydrates");
//            break;
//        default:
//            System.out.println("Don't know about it.");
//    }



//// Days with day number.
//
//    System.out.print("Enter day number: ");
//    int dayno = sc.nextInt();
//
//    switch(dayno){
//        case 1 -> System.out.println("Monday");
//        case 2 -> System.out.println("Tuesday");
//        case 3 -> System.out.println("Wednesday");
//        case 4 -> System.out.println("Thursday");
//        case 5 -> System.out.println("Friday");
//        case 6 -> System.out.println("Saturday");
//        case 7 -> System.out.println("Sunday");
//        default -> System.out.println("Please enter a valid num" +
//                "ber between 1 to 7.");
//        }

// to get whether it's a weekday or weekend.

//    System.out.print("Enter day number: ");
//    int dayno = sc.nextInt();
//        switch(dayno){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday!");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend!");
//        }

//        // by advanced switch
//        System.out.print("Enter day number: ");
//        int dayno = sc.nextInt();
//
//        switch (dayno) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday!");
//            case 6, 7 -> System.out.println("Weekend!");
//        }

// Nested switch;
        int emp_id = sc.nextInt();
        String department = sc.next();

        switch (emp_id) {
            case 1 -> System.out.println("Rishabh Saini");
            case 2 -> System.out.println("Rashmika Mandana");
            case 3 -> {
                System.out.println("~~~~Department~~~~");
                 switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "AI" -> System.out.println("AI Department");
                    case "CC" -> System.out.println("Cloud Computing Department");
                }
            }
        }



}
}