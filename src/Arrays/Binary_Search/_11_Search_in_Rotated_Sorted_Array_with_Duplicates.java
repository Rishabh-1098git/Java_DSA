package Arrays.Binary_Search;

public class _11_Search_in_Rotated_Sorted_Array_with_Duplicates {
    public static void main(String[] args) {
        int[] arr = {3,4,5,5,5,6,7,0,1,2};
        int target=5;
        int ans1 = binarysearch(arr,target,0,findPivotinRotatedSortedArray(arr));
        int ans2 = binarysearch(arr,target,findPivotinRotatedSortedArray(arr)+1,arr.length-1);
        if(ans1!=-1){
            System.out.println(ans1);
//            return ans1;
        }
        else if(ans2!=-1){
            System.out.println(ans2);
//            return ans2;
        }
        else {
            System.out.println(-1);
//            return -1;
        }
    }

    static int findPivotinRotatedSortedArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            // 4 cases
            // case-1
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case-2
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case-3
            // if elements at start, mid and end are equal just skip the duplicates
            if(arr[s]==arr[mid] && arr[e]==arr[mid]){
                // what if start and end were the pivot??
                // check if start is pivot
                if(arr[s]>arr[s+1]){
                    return s;
                }
                s++;
                // check whether end is pivot
                if(arr[e]<arr[e-1]){
                    return e-1;
                }
                e--;
            }
            // case-4
            // left side is sorted, pivot lies on the right
            else if(arr[s]<arr[mid] || arr[mid]==arr[s] && arr[mid]>arr[e]){
                    s = mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr,int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if (target>arr[mid]) {
                start = mid+1;
            }
            else{ // target<arr[mid]
                end= mid-1;
            }
        }
        return -1;
    }


}
