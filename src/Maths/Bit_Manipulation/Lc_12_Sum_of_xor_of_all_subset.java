package Maths.Bit_Manipulation;

public class Lc_12_Sum_of_xor_of_all_subset {
    public static void main(String[] args) {
        int [] nums = {5,1,6};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum+=xorTotal(nums,i,j);
            }
        }
        System.out.println(sum);
    }
    static int xorTotal(int[] arr, int start, int end){
        int xor=0;
        for(int i=start;i<=end;i++){
            xor^=arr[i];
        }
        return xor;
    }
}
