package Maths.Bit_Manipulation;

import java.util.Scanner;

public class _01_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = n & 1;
        if(ans==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
