package Recursion.Level_1;

public class _02_Print_1_to_n {
    public static void main(String[] args) {
        int n =10;
        printn(1,10);
        System.out.println();
        printn1(10);
    }
    static void printn(int s, int e){
        if(s>e){
            return;
        }
        System.out.print(s+" ");
        printn(s+1,e);
    }
    static void printn1(int n){
        if(n==0){
            return;
        }
        printn1(n-1);
        System.out.print(n+" ");
    }
}
