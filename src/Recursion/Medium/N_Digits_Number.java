package Recursion.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class N_Digits_Number {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(func(2,1,1));

    }

    static ArrayList<Integer> func(int n, int prev, int l){
        ArrayList<Integer> list = new ArrayList<>();
        if(n==1){
            for(int i=0;i<=9;i++){
                list.add(i);
            }
            return list;
        }
        if(l == n){
            list.add(prev);
            return list;
        }
        if(prev == 10){
            return list;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = prev%10+1; i <= 9 ; i++) {
            if(i>prev%10){
                int temp = prev*10 + i;
                ans.addAll(func(n, temp,l+1));
            }
        }
        ans.addAll(func(n,(prev%10)+1,1));
        return ans;
    }

}
