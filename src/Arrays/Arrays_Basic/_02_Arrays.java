package Arrays.Arrays_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Arrays {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 90;
        arr[1] = 93;
        arr[2] = 65;
        arr[3] = 70;
        arr[4] = 60;
        System.out.println(Arrays.toString(arr));

        // input an array using for loop

        int[] arr1 = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length;i++){
            System.out.printf("Enter %dth index element: ",i);
            arr1[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        // for each loop => to iterate through the arr
        for(int element: arr1){
            System.out.print(element+" ");
        }

        // Arrays.toString(array_name) method => gives string representation of the array.
        System.out.println(Arrays.toString(arr1));



    }
}
