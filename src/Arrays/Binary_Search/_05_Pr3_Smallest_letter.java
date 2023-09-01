package Arrays.Binary_Search;

public class _05_Pr3_Smallest_letter {
    public static void main(String[] args) {
        // letters = ["c","f","j"]
        char[] arr = {'c','f','j'};
        char target = 'f';
        char a = smallestchr(arr,  target);
        System.out.println(a);
    }

     static char smallestchr(char[] arr, char target) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s +(e-s)/2;
            if(target>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return arr[s%arr.length];
    }
}
