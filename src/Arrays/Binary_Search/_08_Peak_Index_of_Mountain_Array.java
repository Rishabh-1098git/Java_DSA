package Arrays.Binary_Search;

public class _08_Peak_Index_of_Mountain_Array {
    public static void main(String[] args) {
        // arr = {1,3,5,7,6,3,2}
        int[] arr = {0,1,2,3,4,2,1,0};
        int start =0;
        int end =arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in the decreasing part of the array
                end=mid;
            }else {
                // you are in the increasing part of the array
                start=mid+1;
            }
        }
        // loop will break when start = end
        System.out.println(start);
        System.out.printf("arr[%d]=%d",start,arr[start]);
//        return start; // or return end

    }
}
