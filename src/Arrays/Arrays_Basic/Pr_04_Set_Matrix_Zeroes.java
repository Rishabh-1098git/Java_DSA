package Arrays.Arrays_Basic;

import java.util.Arrays;

public class Pr_04_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},
                           {1,0,1},
                           {1,1,1}};
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        int[][] newmat = new int[matrix.length][matrix[0].length];
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                newmat[i][j]=matrix[i][j];
            }
        }


        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                if(newmat[i][j]==0){
                    int tempi=i;
                    int tempj=j;
                    for(int p=0;p<=c;p++){
                        matrix[tempi][p]=0;
                    }
                    for(int q=0;q<=r;q++){
                        matrix[q][tempj]=0;
                    }
                }
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
