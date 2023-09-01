package Maths.Bit_Manipulation;

public class _02_Singly_Occuring_Element {
    public static void main(String[] args) {
        int [] arr ={2,3,4,1,2,1,3,6,4,6,8};
        // n^n == 0;
        System.out.println(single_Occuring(arr));
        }
    static int single_Occuring(int [] arr){
        int xor1=0;
        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1^arr[i];
        }
        return xor1;
    }
}
