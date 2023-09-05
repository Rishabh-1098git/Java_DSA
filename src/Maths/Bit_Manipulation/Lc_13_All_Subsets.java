package Maths.Bit_Manipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lc_13_All_Subsets {
    public static void main(String[] args) {
        // nums = [1,2,3]
        int[] nums = {1,2,2};
        int limit = (int)Math.pow(2,nums.length)-1;
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<=limit;i++){
            int c=nums.length-1;
            int n =i;
            List<Integer>list1 = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((n&1)==1){
                    list1.add(nums[c]);
                }
                c--;
                n=n>>1;
            }
            list.sort(null);
            System.out.println(list1);
        }

        System.out.println(list);
    }
}
