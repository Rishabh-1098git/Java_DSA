package Recursion._10_Days_Recursion_Challenge_;
import java.util.ArrayList;

public class _08_TowerOfHanoi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(toh(3,1,2,3, list));

    }
    static ArrayList<ArrayList<Integer>> toh(int n, int t1, int t2, int t3,ArrayList<ArrayList<Integer>> list){
        if(n==0){
            return list;
        }
        ArrayList<Integer> temp = new ArrayList<>();

        toh(n-1, t1, t3, t2,list);
        temp.add(t1);
        temp.add(t2);
        list.add(temp);
        toh(n-1, t3, t2, t1,list);

//        list.add(temp);
        return list;
    }

}
