package Arrays.Binary_Search;

public class _13_Coco_Eating_Bananas_Brute_Force {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 5;
        System.out.println(min_banana(arr,h));;
    }

    private static int min_banana(int[] arr, int h) {
        for (int i = 1; i <=max(arr) ; i++) {
            if(total_hour(arr,i)<=h){
                return i;
            }
        }
        return -1;
    }

    private static int max(int[] arr) {
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }

    private static int total_hour(int[] arr, int i) {
        int hours = 0;
        for (int j = 0; j < arr.length ; j++) {
            hours+= Math.ceil((double)(arr[j]) / (double)(i));
        }
        return hours;
    }

}
