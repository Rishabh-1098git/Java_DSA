package Arrays.Binary_Search;

public class _04_Pr2_Floor_of_a_number {
    public static void main(String[] args) {
        // Floor --> the biggest number less than equal to target
        int[] arr = {2,3,5,9,14,16,28};
        int target =8;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
        // wht if the target is the smalest number in the array

        int s =0;
        int e =arr.length-1;
        int mid=0;
        while(s<=e){
            mid = s + (e-s)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return arr[e];
    }

    }

