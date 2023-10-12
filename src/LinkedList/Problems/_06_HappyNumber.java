package LinkedList.Problems;

public class _06_HappyNumber {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do{
            s = findSquares(s);
            f = findSquares(findSquares(f));
        }while(s!=f);
        if(s==1){
            return true;
        }
        else{
            return false;
        }

    }
    static int findSquares(int n){
        int ans=0;
        while(n>0){
            int rem = n%10;
            ans +=  rem*rem;
            n /=10;
        }
        return ans;
    }
}
