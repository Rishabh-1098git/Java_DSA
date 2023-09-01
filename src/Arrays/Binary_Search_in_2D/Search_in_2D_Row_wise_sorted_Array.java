package Arrays.Binary_Search_in_2D;

import java.util.Arrays;

public class Search_in_2D_Row_wise_sorted_Array {
    public static void main(String[] args) {
        int [][] arr ={{10,20,30,40},
                       {15,25,35,45},
                       {28,29,37,49},
                       {33,34,38,50}};
        int target = 50;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int [][]arr, int target){
        int row=0;
        int col=arr[0].length-1;
        int [] ans = {-1,-1};
        while(row< arr.length && col>=0){
            if(arr[row][col]==target){
                ans[0]=row;
                ans[1]=col;
                return ans;
            }
            else if (arr[row][col]<target) {
                row++;
            }
            else if (arr[row][col]>target) {
                col--;
            }
        }
        return ans;
    }

}

