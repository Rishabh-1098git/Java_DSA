package DynamicProgramming;

public class _01_01_KnapSack {
    public static void main(String[] args) {
        int[] val = {1, 4, 5, 7};
        int[] wt = {1, 3, 4, 5};
        int W = 7;

        System.out.println("Max Profit : "+ knapsack(wt, val, W, 0 , 0));
//        System.out.println("Max Profit2 : "+ knapsack2(wt, val, W, 4));

    }

    static int knapsack(int[] wt, int[] val, int w, int index, int profit){
        if(index == wt.length || wt[index] > w ){
            return profit;
        }
        int take = knapsack(wt, val, w-wt[index], index+1, profit+val[index]);
        int notTake = knapsack(wt, val, w, index+1, profit);

        return Math.max(take, notTake);
    }
    static int knapsack2(int[] wt, int[] val, int w, int n){
        if(n == 0 || w == 0){
            return 0;
        }
        if(wt[n-1] <= w){
            return Math.max(val[n-1] + knapsack2(wt, val, w-wt[n-1], n-1), knapsack2(wt, val, w, n-1));
        }
        else{
            return knapsack2(wt, val, w, n-1);
        }
    }


}
