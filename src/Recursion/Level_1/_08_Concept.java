package Recursion.Level_1;

public class _08_Concept {
    public static void main(String[] args) {
//        print1(10);
        print2(10);
    }
    // this will give stackoverflow error ==> infinite recursion call
    static void print1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print1(n--);
    }
    static void print2(int n){
        if(n==0) {
            return;
        }
        System.out.print(n+" ");
        print2(--n);
    }
}
