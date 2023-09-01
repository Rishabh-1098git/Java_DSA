package Arrays.Binary_Search;

public class _07_Infinite_Sorted_Array {
    public static void main(String[] args) {
      // infinite sorted array --> we were given an array in which we assume that we
      // cannot use length function bcz it has infinite length

        int[] arr = {2,3,4,6,9,14,15,17,19,23,28,29,31,32,36,38,40,41,42,43,46,47,50,
                51,55,57,66,78,89,92};
        int target = 36;
        int a = ans(arr, target);
        System.out.printf("arr[%d] = %d",a,arr[a]);
    }

     static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            // end = end + (size of an array)*2
            // size of an array --> (end-start+1)
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
