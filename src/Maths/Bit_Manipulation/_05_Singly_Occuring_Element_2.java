package Maths.Bit_Manipulation;

public class _05_Singly_Occuring_Element_2 {
    public static void main(String[] args) {
        int [] arr = {2,2,4,2,7,7,8,7,8,8};
        int sum=0;

        for (int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
