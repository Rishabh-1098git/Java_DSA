package Maths.Bit_Manipulation;
public class Negative_of_a_number {
    public static void main(String[] args) {
        // Negative of a number ==> 2's Complement
        int n =10;
        int neg = (~n)+1; // -10
        System.out.println(neg);
    }
}
