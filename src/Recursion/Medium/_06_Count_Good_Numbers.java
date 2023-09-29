package Recursion.Medium;

public class _06_Count_Good_Numbers {
    public static void main(String[] args) {
        int n=50;
        long first;
        long second;
        if(n%2==0){
            first = n/2;
        }
        else{
            first = (n/2)+1;
        }
        second = n/2;

        long ans = power(5, first)*power(4,second);


        System.out.println(ans);
    }

    static long power(long x, long y){
        if(y==0){
            return 1;
        }
        long ans = power(x,y/2);
        ans*=ans;
        ans %= (long) (1e9+7);
        if(y%2!=0){
            ans *= x;
        }
        return ans;
    }

    static int countGood(int n, int i, String str){
        if(str.length()==n){
            if(isGood(str)){
                return 1;
            }
            else {
                return 0;
            }
        }
        int count = 0;
            for (int j = 0; j <=9 ; j++) {
                count+= countGood(n,i+1,str+j);
            }
        return count;
    }
    static boolean isGood(String str){
        for (int i = 0; i < str.length(); i++) {
            int temp = (int)str.charAt(i)-48;
            if(i%2 == 0){
                if(!(temp%2==0)) {
                    return false;
                }
            }
            else{
                if(!isPrime(temp)){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }


}
