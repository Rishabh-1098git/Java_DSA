package Maths.Bit_Manipulation;

public class _09_Power_of_two {
    public static void main(String[] args) {
        // power of two no's are ==> 10->2, 100-->4, 1000--> 8, 10000-->16, ....
        int n=10;
        int count =0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        if (count==1){
            System.out.println("It is power od two.");
        }
        else{
            System.out.println("It is not power of two.");
        }

        System.out.println(count);

        //  2nd method ==>
        System.out.println(power2(3));
    }

    static boolean power2(int n){
        return (n&(n-1))==0;
    }
}
