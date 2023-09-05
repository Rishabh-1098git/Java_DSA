package Maths.Bit_Manipulation;

public class Lc_12_Sum_of_xor_of_all_subset {
    public static void main(String[] args) {
        int [] nums = {3,4,5,6,7,8};
        int sum=0;
        int limit = (int)Math.pow(2, nums.length)-1;
        for (int i = 0; i <=limit ; i++) {
            sum+=xorTotal(nums,i);
        }
        System.out.println(sum);
    }
    static int xorTotal(int[]arr, int i){
        int xor=0;
        int c =arr.length-1;
        for (int j = 0; j < arr.length ; j++) {
            if((i&1)==1){
                xor^=arr[c];
            }
            c--;
            i=i>>1;
        }
        return xor;
    }
//    static int xorTotal(int[] arr, int start, int end){
//        int xor=0;
//        for(int i=start;i<=end;i++){
//            xor^=arr[i];
//        }
//        return xor;
//    }
}
