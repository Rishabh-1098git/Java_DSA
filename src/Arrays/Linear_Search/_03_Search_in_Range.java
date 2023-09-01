package Arrays.Linear_Search;

public class _03_Search_in_Range {
    public static void main(String[] args) {
        int[] arr = {23,45,21,34,78,89,-2,-34,-7};
        boolean ans = search(arr,-2,3,6);
        System.out.println(ans);
    }

    static boolean search(int[] arr,int target ,int start,int end){
        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
