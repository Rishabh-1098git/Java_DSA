package Maths.Bit_Manipulation;

import java.util.Arrays;

public class _13_Flipping_and_Inverting {
    public static void main(String[] args) {
            int[][] image={{1,1,0}
                          ,{1,0,1}
                          ,{0,0,0}};
            int[][] ans = flipping_and_inverting(image);
            for (int i = 0; i < image.length ; i++) {
                System.out.println(Arrays.toString(image[i]));
            }
    }
    static int[][] flipping_and_inverting(int [][] image){
        int s;
        int e;
        for(int i=0;i<image.length;i++){
            s=0;
            e=image[i].length-1;
            while(s<=e){
                swap(image[i],s,e);
                s++;
                e--;
            }
        }
        return image;
    }
    static void swap(int[]arr,int s, int e){
        int temp = arr[e]^1;
        arr[e] = arr[s]^1;
        arr[s] = temp;
    }
}
