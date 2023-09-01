package Arrays.Arrays_Basic;

import java.util.ArrayList;

public class Pr_01_Lucky_number {
    public static void main(String[] args) {
        // lucky number --> min in row and max in column
        ArrayList<Integer> list = new ArrayList<>();
        int[][] arr = {{1,10,4,2},
                       {9,3,8,7},
                       {15,16,17,12}};
        int ti = 0;
        int tj = 0;
        int lucky =0;
        int max2=0;

        for (int i = 0; i <arr.length ; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j <arr[0].length ; j++) {
                    if(arr[i][j]<min){
                        min = arr[i][j];
                        ti = i;
                        tj = j;
                        lucky = arr[ti][tj];
                    }
            }
            System.out.println(lucky);
//            int a=0;
            max2=0;
            for (int j = 0; j <arr.length ; j++) {
//                max2 =0;
                if(arr[j][tj]>max2){
                    max2=arr[j][tj];
                }
            }
            if(max2==lucky){
                list.add(lucky);
            }
        }


        System.out.println(list);

    }
}


