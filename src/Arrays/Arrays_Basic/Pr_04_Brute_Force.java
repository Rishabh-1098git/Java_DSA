package Arrays.Arrays_Basic;

import java.util.Arrays;

public class Pr_04_Brute_Force {
    public static void main(String[] args) {
        int [][] matrix = {{0,1}};
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        for (int i = 0; i <=r ; i++) {
            for (int j = 0; j <=c ; j++) {
                if(matrix[i][j]==0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for (int i = 0; i <=r ; i++) {
            for (int j = 0; j <=c ; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

        for (int i = 0; i <=r ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

     static void markCol(int[][] matrix,int j) {
         for (int i = 0; i <matrix.length ; i++) {
             matrix[i][j]=-1;
         }
    }

     static void markRow(int[][] matrix,int i) {
         for (int j = 0; j <matrix.length ; j++) {
             matrix[i][j]=-1;
         }
    }

}
