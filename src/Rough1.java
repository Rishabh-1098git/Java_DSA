public class Rough1 {
    public static void main(String[] args) {
        // the kth factor ==> Brute Force
        int n =7;
        int k=2;
        System.out.println(get_Kth_factor(7,2));
    }
    static int get_Kth_factor(int n, int k){
        int count=0;
        for (int i =1; i<=n ; i++) {
            if((n%i)==0){
                count++;
                if(count==k){
                    return i;
                }
            }
        }
        return -1;
    }
}
