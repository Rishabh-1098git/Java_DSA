import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Rough1 {
    public static void main(String[] args) {

    }
    static long countTriplets(int a, int b){
        int[]arr = new int[b-a+1];
        int j=0;
        for (int i = a; i <=b ; i++) {
            arr[j] = i;
            j++;
        }
        long count=0;
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-2 ; i++) {
            for (int k = i+1; k < arr.length-1 ; k++) {
                for (int l = k+1; l < arr.length ; l++) {
                    int LCM = findLCMOfThree(arr[i],arr[k],arr[l]);
                    if((isGood(a,b,arr[i],arr[k],arr[l]) && (LCM >= (arr[i]+arr[k]+arr[l])))){
                        count++;
                    }
                }
            }
        }
//        System.out.println(count);
        return count;
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find the LCM of three numbers
    public static int findLCMOfThree(int num1, int num2, int num3) {
        // LCM of three numbers (a, b, and c) can be calculated as:
        // LCM(a, b, c) = LCM(LCM(a, b), c)
        // First, find LCM of num1 and num2
        int gcdOfFirstTwo = findGCD(num1, num2);
        int lcmOfFirstTwo = (num1 * num2) / gcdOfFirstTwo;
        // Then, find LCM of the result and num3
        int gcdOfAllThree = findGCD(lcmOfFirstTwo, num3);
        int lcmOfThree = (lcmOfFirstTwo * num3) / gcdOfAllThree;
        return lcmOfThree;
    }
    static boolean isGood(int a, int b, int p ,int q, int r){
        if(a<=p && p<q && q<r && r<=b){
            return true;
        }
        return false;
    }

}

