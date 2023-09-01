package Arrays.Arrays_Basic;

import java.util.Arrays;

public class Pr_04_Optimal_Solution {
    public static void main(String[] args) {
        int [][] mat = {{0,1,2,0},
                        {3,4,5,2},
                        {1,3,1,5}};
        int colO=1;

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if(mat[i][j]==0){
                    // mark the row
                    mat[i][0]=0;
                    // mark the column
                    if(j!=0){
                        mat[0][j] = 0;
                    }
                    else{
                        colO=0;
                    }
                }
            }
        }

        for (int i = 1; i < mat.length ; i++) {
            for (int j = 1; j <mat[0].length ; j++) {
                if(mat[i][j]!=0){
                    if (mat[i][0]==0 || mat[0][j]==0){
                        mat[i][j]=0;
                    }
                }
            }
        }
        if(mat[0][0]==0){
            for (int j = 0; j <mat[0].length ; j++) {
                mat[0][j]=0;
            }
        }
        if(colO==0){
            for (int i = 0; i <mat.length ; i++) {
                mat[i][0]=0;
            }
        }

        for (int i = 0; i <mat.length ; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }

    }
}
