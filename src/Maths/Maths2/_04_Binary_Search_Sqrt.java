package Maths.Maths2;

public class _04_Binary_Search_Sqrt {
    public static void main(String[] args) {
            int n=40;
            int p=4;
            System.out.println(sqrt(n,p));
    }
    static double sqrt(int n, int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid*mid==n){
                return n;
            } else if (mid*mid>n) {
                e=mid-1;
            }
            else{
                s=mid+1;
                root=mid;
            }
        }
        double incre = 0.1;
        for (int i = 0; i <p ; i++) {
            while(root*root<=n){
                root+=incre;
            }
            root-=incre;
            incre/=10;
        }
        return root;
    }
}
