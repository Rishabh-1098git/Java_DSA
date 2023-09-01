package Strings;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class _04_Operators_in_Strings {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // take there ASCII value then add and then print it.
        System.out.println("a"+"b"); // strings are concatenated

        System.out.println((char)('a'+1));

        System.out.println("a"+1);
        // integer will be converted to Integer that will call toString()
        // same as "a" + "1"

        System.out.println("rishabh" + new ArrayList<>());
     // System.out.println(new ArrayList<>()+ new Integer(5));

        // this will give an error bcz operator can be used only on
        // primitive data type the only condition it will work is that
        // one of the object must be string

        System.out.println(new ArrayList<>()+ ""+ new Integer(56));

    }
}
