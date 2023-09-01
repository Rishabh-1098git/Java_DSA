package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Rough2 {
    public static void main(String[] args) {
        // Longest Common Prefix -->>
       String [] str = {"aaa","aa","aaaa"};
       int n = str.length;
//       int min_length = Integer.MAX_VALUE;
//
//       int max_length=Integer.MIN_VALUE;
//
//       int max_common_length = Integer.MAX_VALUE;
//
//       for (int i = 0; i <n ; i++) {
//            min_length = Math.min(min_length,str[i].length());
//       }
//
//        for (int i = 0; i < n-1 ; i++) {
//            int p=i+1;
//            int count = 0;
//            max_length=0;
//            for (int j = 0; j <min_length ; j++) {
//                if(str[i].charAt(j)==str[p].charAt(j)){
//                    count++;
//                    max_length = Math.max(count,max_length);
//                }
//                else {
//                    break;
//                }
//            }
//            max_common_length = Math.min(max_common_length,max_length);
//
//        }
//
//        // now we have max common length
//
//        System.out.println(str[0].substring(0,max_common_length));


//        Method 2

        Arrays.sort(str);
//after sorting at extremes there will be strings with max and min common element

// we will check for max_common_length in these elements

        String s1 = str[0];
        String s2 = str[str.length-1];
        int idx=0;
        while(idx<s1.length() && idx<s2.length()){
            if(s1.charAt(idx)==s2.charAt(idx)){
                idx++;
            }
            else{
                break;
            }
        }

        System.out.println(str[0].substring(0,idx));


    }
}