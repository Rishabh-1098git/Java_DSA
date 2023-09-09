package Recursion.Recursion_Pattern_Problems;
// print ==>
// *
// * *
// * * *
// * * * *
// * * * * *
public class Que2 {
    public static void main(String[] args) {
        print(5,0);
    }
    static void print(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c >= r) {
            print(r - 1, 0);
            System.out.println();
        } else {
            print(r, c + 1);
            System.out.print("* ");
        }
    }
}
