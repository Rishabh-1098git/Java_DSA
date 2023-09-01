package Arrays.Arrays_Basic;

import java.util.Arrays;

public class _10_Transpose_an_Array {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] element: arr){
            System.out.println(Arrays.toString(element));
        }
        transpose(arr);
        for(int[] element: arr){
            System.out.println(Arrays.toString(element));
        }
        reverse(arr);
        for(int[] element: arr){
            System.out.println(Arrays.toString(element));
        }
    }

    static int[][] reverse(int[][] arr){
        int start = 0;
        int end = arr.length-1;

            while(start<=end){
                for (int i = 0; i <arr.length ; i++) {
                int temp = arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                }
                start++;
                end--;
            }
        return arr;
    }



     static int[][] transpose(int[][] arr) {
         for (int i = 0; i <arr.length ; i++) {
             for (int j =i; j < arr[0].length ; j++) {
                 int temp = arr[i][j];
                 arr[i][j]=arr[j][i];
                 arr[j][i]=temp;
             }
         }
         return arr;
    }

    static boolean chechEqual(int[][] arr1, int[][] arr2){
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[0].length ; j++) {
                if(arr1[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    for(int i=0;i<4:i++){
            if(checkEqual(arr1,arr2)){
                return true;
            }
            transpose(arr1);
            reverse(arr1);
        }
     */


}
