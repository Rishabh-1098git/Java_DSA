package HW;
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {
        // Input: nums = [0,0,1,1,1,2,2,3,3,4]
        // Output: 5, nums = [0,1,2,3,4]
        int [] arr = {1,2,3,4,4,6,11,12};
        int [] ans = removeDuplicates(arr);
        System.out.println(ans.length+", nums: "+Arrays.toString(ans));
    }
    static int[] removeDuplicates(int [] arr){
        int size = arr.length;

        // maxi element
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            maxi = Math.max(arr[i],maxi);
        }

        // Creating a hash Array
        int [] hash = new int[maxi+1];

        // hashing
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        // noting which element occuring how many times
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<hash.length;i++){
            if(hash[i]!=0){
                list.add(i);
            }
        }
        // creating array
        int [] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
