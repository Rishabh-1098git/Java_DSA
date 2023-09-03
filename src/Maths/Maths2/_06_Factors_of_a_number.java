package Maths.Maths2;

import java.util.ArrayList;

public class _06_Factors_of_a_number {
    public static void main(String[] args) {
        factors1(256);
        System.out.println();
        factors2(256);
//        System.out.println();
        factors3(256);
    }
    // time complexity = O(N)
    static void factors1(int n){
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    // time complexity = O(sqrt(N))
    static void factors2(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i+" ");
                }
                else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
    // now both TC and SC will be O(sqrt(N))
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                if(n/i==i){
//                    System.out.println(i+" ");
                    list.add(i);
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
//        System.out.println(list);
            for (int j = 0; j <list.size() ; j++) {
                System.out.print(list.get(list.size()-1-j)+" ");
            }
    }

}
