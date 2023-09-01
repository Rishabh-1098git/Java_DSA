package Arrays.Linear_Search;

public class _06_Max_in_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{2233,12,45},
                {1,343,2,5645},
                {45,67,23,1,96}};
        System.out.println(Maximum(arr));
    }

    static int Maximum(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < arr[i].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}
