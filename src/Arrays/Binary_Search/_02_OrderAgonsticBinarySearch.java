package Arrays.Binary_Search;

public class _02_OrderAgonsticBinarySearch {
    public static void main(String[] args) {
            int[] arr = {90,87,71,45,37,32,27,20,19,17,12,-7,-10,-17};
            int target = 32;
            int a = orderAgnosticBinarySearch(arr, target);
            System.out.println("Index: " + a);
            System.out.printf("arr[%d]= %d",a,arr[a]);
    }
    static int orderAgnosticBinarySearch(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            //to check whether given array is sorted in ascending or in descending
            boolean is_Asc = nums[e]>nums[0];

            if (target == nums[mid]){
                return mid;
            }
            // for ascending
            if (is_Asc) {
                if (target>nums[mid]){
                    s = mid+1;
                } else {
                    e = mid-1;
                }
            }
            // for descending
            else {
                if (target>nums[mid]){
                    e = mid-1;
                } else {
                    s = mid+1;
                }
            }

        }
        return -1;
    }

}
