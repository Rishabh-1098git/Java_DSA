package Recursion.Level_1;

public class _07_Product_of_Digits {
    public static void main(String[] args) {
        System.out.println("Product of digits: "+prod_digits(1098));
    }
    static int prod_digits(int n){
        if(n/10 == 0){
            return n;
        }
        return (n%10)*prod_digits(n/10);
    }
}
