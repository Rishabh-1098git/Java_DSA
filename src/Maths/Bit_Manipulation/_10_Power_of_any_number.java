package Maths.Bit_Manipulation;

public class _10_Power_of_any_number {
    public static void main(String[] args) {
        int base = 3;
        int power = 5;
        int ans=1;
        while(power>0){
            if((power&1)==1){
                ans*=base;
            }
            base*=base;
            power = power>>1;
        }
        System.out.println(ans);
    }
}
