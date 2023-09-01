package Arrays.Linear_Search;

public class _04_FindMin {
    public static void main(String[] args) {
        int[] arr = {-12,-34,-56,-17,-3,-45,-54};
        System.out.println(Minimum(arr));
    }

    static int Minimum(int[] arr) {
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

}

