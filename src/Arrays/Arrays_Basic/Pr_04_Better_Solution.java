package Arrays.Arrays_Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pr_04_Better_Solution {
    public static void main(String[] args) {
        int [][] mat = {{1,1,1},
                        {1,0,1},
                        {1,1,1}};

        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if(mat[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if(row[i]==1 || col[j]==1){
                    mat[i][j]=0;
                }
            }
        }

        for (int i = 0; i <mat.length ; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
