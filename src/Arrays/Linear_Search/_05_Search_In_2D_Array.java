package Arrays.Linear_Search;

public class _05_Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{23,12,45},
                       {1,34,2,56},
                       {45,67,23,1,69}};
        int target = 68;
        System.out.println(search(arr, target));
    }

    static boolean search(int[][] arr, int target) {
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }


}
