package Arrays.Binary_Search;

public class _01_Binary_Search {
    public static void main(String[] args) {
        // we must give sorted array in binary search method -->
            int[] arr= {-23,-14,-10,5,10,12,18,21,27,45,67,100,201,206,306,400};
            int target = 21;
            int a = binarysearch(arr,target);
            System.out.println("Index: " + a);
            System.out.printf("arr[%d]= %d",a,arr[a]);
    }

    static int binarysearch(int[] nums,int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
//            int mid = (start+end)/2; // it is possible that (start+end) get out of range of int
            // modified formula
            int mid = s + (e-s)/2;
            if (target>nums[mid]){
                s = mid+1;
            } else if (target<nums[mid]) {
                e = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


}
