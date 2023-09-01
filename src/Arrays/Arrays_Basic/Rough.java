package Arrays.Arrays_Basic;

import java.util.Arrays;
import java.util.*;

public class Rough {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aallex";
//        name.
        System.out.println(isLongPressedName(name,typed));
    }
    static int countChars(String str, char ch){
        int n=str.length();
        int i=0;
        int count =0;
        while(i<n){
            if(ch==str.charAt(i)){
                count++;
            }
            i++;
        }
        return count;
    }

    static boolean isLongPressedName(String name, String typed){
        int l=typed.length();
        int i=0;
        while(i<l){
            if(countChars(name,typed.charAt(i))>countChars(typed,typed.charAt(i))){
                return false;
            }
            i++;
        }
        return true;
    }

}
