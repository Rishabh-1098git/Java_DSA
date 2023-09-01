package Maths.Bit_Manipulation;

public class _04_Posn_of_right_most_bit {
    public static void main(String[] args) {
        int n = 100;
        int neg = ~(n)+1;
        int ans = neg&n;
        System.out.println(ans);

        int count=1;
        while(true){
            if(ans==1){
                System.out.printf("%dth bit is right most set digit.",count);
                break;
            }
            ans = ans>>1;
            count++;
        }

    }
}
