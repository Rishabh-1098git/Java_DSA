package Recursion;

import java.lang.reflect.Array;
import java.util.*;
public class Rough {
    public static void main(String[] args) {
        String s = "aabccabba";
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(sb.charAt(i)==sb.charAt(j)){
                sb.deleteCharAt(i);
                i++;
                sb.deleteCharAt(j);
                j++;
            }
        }

//        return sb.length();
    }

}
