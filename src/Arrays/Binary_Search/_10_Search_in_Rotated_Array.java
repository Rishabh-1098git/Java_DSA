package Arrays.Binary_Search;

public class _10_Search_in_Rotated_Array {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target=5;
        int ans1 = binarysearch(arr,target,0,findPivot(arr));
        int ans2 = binarysearch(arr,target,findPivot(arr)+1,arr.length-1);
        if(ans1!=-1){
            System.out.println(ans1);
        }
        else if(ans2!=-1){
            System.out.println(ans2);
        }
        else {
            System.out.println(-1);
        }
        }

    static int findPivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            // 4 cases
            // case-1
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            // case-2
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // case-3
            if(arr[s]>=arr[mid]){
                e=mid-1;
            }
            // case-4
            else if (arr[s]<arr[mid]){
                s=mid+1;
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

