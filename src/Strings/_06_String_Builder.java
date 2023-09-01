package Strings;

import java.util.Arrays;

public class _06_String_Builder {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        s.substring(2,4);
        String [] arr  = s.split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
