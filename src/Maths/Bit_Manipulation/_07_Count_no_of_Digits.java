package Maths.Bit_Manipulation;

public class _07_Count_no_of_Digits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        int count = (int)(Math.log(n)/Math.log(b))+1;

        System.out.println(count);
    }
}
