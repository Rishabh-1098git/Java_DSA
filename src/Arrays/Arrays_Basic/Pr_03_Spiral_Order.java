package Arrays.Arrays_Basic;

import java.util.ArrayList;

public class Pr_03_Spiral_Order {
    public static void main(String[] args) {

       //  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12}};
        ArrayList<Integer> list = new ArrayList<>();
// Approach 1
/*
        int minr = 0;
        int maxr = mat.length-1;
        int  minc = 0;
        int maxc = mat.length-1;
        int tne = (mat.length)*(mat[0].length);
        int count =0;
        while(count<tne){
            // top wall
            for (int i=minr, j=minc; j<=maxc && count<tne; j++) {
                list.add(mat[i][j]);
                count++;
            }
            minr++;
            //  right wall
            for (int i=minr, j=maxc; i<=maxr && count<tne; i++) {
                list.add(mat[i][j]);
                count++;
            }
            maxc--;
            // bottom row
            for (int i=maxr, j=maxc; j>=minc && count<tne; j--) {
                list.add(mat[i][j]);
                count++;
            }
            maxr--;
            // left row
            for (int i=maxr, j=minc; i>=minr && count<tne; i--) {
                list.add(mat[i][j]);
                count++;
            }
            minc++;
        }
        System.out.println(list);
 */
//--------------------------------------------------------------------------------

// Approach 2
    int left =0;
    int right = mat[0].length-1;
    int top =0;
    int bottom = mat.length-1;

        while(left<=right && top<=bottom) {
            for (int i = left, j = top; i <= right; i++) {
                list.add(mat[j][i]);
            }
            top++;
            for (int i = top, j = right; i <= bottom; i++) {
                list.add(mat[i][j]);
            }
            right--;

            if(top<=bottom) {
                for (int i = right, j = bottom; i >= left; i--) {
                    list.add(mat[j][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom, j = left; i >= top; i--) {
                    list.add(mat[i][j]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
}
