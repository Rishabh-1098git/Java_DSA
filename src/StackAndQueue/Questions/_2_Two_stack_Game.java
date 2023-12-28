package StackAndQueue.Questions;

import java.util.List;
import java.util.Scanner;

public class _2_Two_stack_Game {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return helper(maxSum, a,b, 0, 0)-1;
    }
    private static int helper(int x, List<Integer> a, List<Integer> b, int sum, int count){
        if(sum>x){
            return count;
        }

        if(a.isEmpty() || b.isEmpty()){
            return count;
        }

        int ans1 = helper(x,a.subList(1,a.size()), b,sum+a.get(0), count+1);
        int ans2 = helper(x,a, b.subList(1,b.size()),sum+b.get(0), count+1);

        return Math.max(ans1, ans2);
    }
    
}
