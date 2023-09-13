package Recursion.String_Questions;
import java.util.ArrayList;
import java.util.List;
public class _04_Iterative_solution_of_Subsets {
    public static void main(String[] args) {
            int[] arr = {1,2,3};
            List<List<Integer>> ans = subsets(arr);
            for (int i = 0; i <ans.size() ; i++) {
                System.out.print(ans.get(i)+" ");
            }
    }
    static List<List<Integer>> subsets(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num: arr){
            int n = outer.size();
            for (int i = 0; i <n ; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
