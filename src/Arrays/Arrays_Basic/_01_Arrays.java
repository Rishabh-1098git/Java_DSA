package Arrays.Arrays_Basic;

public class _01_Arrays {
    public static void main(String[] args) {

        // Syntax; datatype[] variable_name = new datatype[size];
        // Store 5 roll numbers

         int[] rollno1 = new int[5];
        // or directly
        int[] rollno= {12,344,56,77,90};

        int[] arr = new int[5]; // arr -> [0,0,0,0,0]
        System.out.println(arr[4]); // -> 0

        // string array
        String[] str_arr = new String[4];
        System.out.println(str_arr[3]);// print -> null


    }
}
