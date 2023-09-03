package Maths.Bit_Manipulation;

public class Lc_08_Number_of_Steps_to_Reduce_to_Zero {
    public static void main(String[] args) {
            int n = 14;
        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int num) {
        // n/=2 equals n>>=1
        if(num==0){
            return 0;
        }
        int count=0;
        while(num>0){
            count += ((num&1)==0 ? 1:2);
            num = num>>1;
        }
        return count-1;
    }
}
