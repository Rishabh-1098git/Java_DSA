package Arrays.Arrays_Basic;

public class Rough {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(HappyNumber(n));
    }
    static boolean HappyNumber(int n){
        int num = n;
        int sum = num;
        int t;
        while(sum/10!=0){
            while(n!=0){
                t = n%10;
                sum+=Math.pow(t,2);
                n/=10;
            }

            if(sum==0){
                return true;
            }
        }
        return false;
    }

}
