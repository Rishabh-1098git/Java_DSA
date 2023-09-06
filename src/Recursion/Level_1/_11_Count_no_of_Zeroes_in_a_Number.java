package Recursion.Level_1;
public class _11_Count_no_of_Zeroes_in_a_Number {
    public static void main(String[] args) {
        System.out.println(countZeroes(120098008));
        System.out.println(countZeroes(1000000000));
    }

    static int countZeroes(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }
        else if(n%10==0){
            return helper(n/10,count+1);
        }
        else {
            return helper(n/10,count);
        }
    }

}
