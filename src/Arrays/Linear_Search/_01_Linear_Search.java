package Arrays.Linear_Search;

public class _01_Linear_Search {
    public static void main(String[] args) {
        int[] arr = {12,34,21,45,67,78,45,43};
        int n=67;
        int a= Linearsearch(arr,n);;
        System.out.println(a);
    }

    // Search in an Array: return the index if item found
    // If item  not found return -1.
    static int Linearsearch(int[] arr, int n){
        if (arr.length==0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++){
               if(arr[i]==n) {
                   return i;
               }
            }
            return -1;
        }
    }


}
