package Arrays.Binary_Search;

public class _09_Search_in_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,3,2,1};
        int target =1;
        int ans = searchMountain(arr,target);
        System.out.printf("arr[%d]=%d",ans,arr[ans]);

    }

    static int searchMountain(int[] arr, int target){
        int ans1 = binarySearch(arr,0,searchPeak(arr),target);
        if(ans1!=-1){
            return ans1;
        }
        int ans2 = binarySearch(arr,searchPeak(arr),arr.length-1,target);
        if(ans2!=-1){
            return ans2;
        }
      return -1;
    }
    static int searchPeak(int[] arr){
        int start =0;
        int end= arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    static int binarySearch(int[]arr, int start, int end, int target){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

}
