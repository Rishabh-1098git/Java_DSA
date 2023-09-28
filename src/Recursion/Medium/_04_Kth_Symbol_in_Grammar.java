package Recursion.Medium;

public class _04_Kth_Symbol_in_Grammar {
    public static void main(String[] args) {

        System.out.println(kthSymbol(5,8));

    }
    static int kthSymbol(int n, int k){
        if(n==1){
            return 0;
        }

        int prevlen = (int)Math.pow(2,n-2);

        if(k<=prevlen){
            return kthSymbol(n-1, k);
        }
        else{
            int ans = kthSymbol(n-1,k-prevlen);
            return ans==0 ? 1:0;
        }
    }
}
