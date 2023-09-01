package Arrays.Arrays_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class _04_2D_Arrays {
    public static void main(String[] args) {

//        int[][] arr = new int[3][];
//        //   [0,0,0]
//        //   [0,0,0]
//        //   [0,0,0]
//
//        int[][] arr1 = {{0,1,2},{5,4,1},{9,8,7}};
//        System.out.println(Arrays.deepToString(arr1));
//
//        // 2D array with different row sizes
//        int[][] arr2 = {{1,2,3},
//                        {4,5},
//                        {6,7,8}};
//        System.out.println(Arrays.deepToString(arr2));
//
//
//        // to take input of 2D array
//        Scanner sc = new Scanner(System.in);
//        int[][] arr3 = new int[3][3];
//        for(int i=0;i< arr3.length;i++){
//                for(int j=0;j<arr3[i].length;j++){
//                    arr3[i][j]=sc.nextInt();
//                }
//        }
//        System.out.println(Arrays.deepToString(arr3));
//
//
//        // to print it in matrix form using enhanced for loop
//        System.out.println("Array in matrix form -->");
//        for(int[] arrr: arr3){
//            System.out.println(Arrays.toString(arrr));
//        }

        // iterating through an array of different row size->
        int [][] arr4 = {{1,2,3},
                         {4,5},
                         {6,7,8}};

        for(int i=0; i<arr4.length;i++){
            for(int j=0; j<arr4[i].length;j++){
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }


    }
}
