package Arrays.Linear_Search;

public class _07_Find_even_no_digits {
    public static void main(String[] args) {
        int arr[] = {232,145,236,12,18,3456};
        System.out.println(findNumbers(arr));
        System.out.println(findNumbers2(arr));
    }

    static int findNumbers(int[] nums) {
        int evens=0;
        for(int i=0; i<nums.length;i++){
            int n= nums[i];
            int count=0;
            while(n>0){
                n/=10;
                count++;
            }
            if(count%2==0){
                evens++;
            }
        }
        return evens;
    }

    // Optimised way
    // to get number of digits of a given number
    static int findNumbers2(int[] nums) {
        int evens=0;
        for(int i=0; i<nums.length;i++){
            int n= nums[i];
            int count = (int) (Math.log10(n)+1);
            if(count%2==0){
                evens++;
            }
        }
        return evens;
    }


}
