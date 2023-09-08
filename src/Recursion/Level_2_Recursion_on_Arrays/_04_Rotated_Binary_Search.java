package Recursion.Level_2_Recursion_on_Arrays;

public class _04_Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        System.out.println(rotatedBinarySearch(arr,3,0,arr.length-1));
    }
    static int rotatedBinarySearch(int[] arr,int t,int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==t){
            return m;
        }
        if(arr[s]<arr[e]){
            if(t>=arr[s] && t<=arr[m]){
                return rotatedBinarySearch(arr, t, s,m-1);
            }
            else{
                return rotatedBinarySearch(arr,t,m+1,e);
            }
        }
        if(t>=arr[m] && t<=arr[e]){
            return rotatedBinarySearch(arr,t,m+1,e);
        }
        else {
            return rotatedBinarySearch(arr,t,s,m-1);
        }
    }
}
