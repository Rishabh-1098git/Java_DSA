package Recursion.Recursion_Pattern_Problems;
// print ==>
// * * * * *
// * * * *
// * * *
// * *
// *
public class Que1 {
    public static void main(String[] args) {
        print(5,0);
    }
    static void print(int r, int c){
        if(r==0){
            return;
        }
        if(c>=r){
            System.out.println();
            print(r-1,0);
        }
        else {
            System.out.print("* ");
            print(r, c + 1);
        }
    }
}
