package Strings;

import java.util.Arrays;

public class _07_Methods {
    public static void main(String[] args) {
//        Methods provided by string
        String name = "Rishabh Saini";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('R'));

        System.out.println("  rishabh   ".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
