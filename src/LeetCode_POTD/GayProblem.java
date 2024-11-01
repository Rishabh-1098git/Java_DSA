package LeetCode_POTD;

import java.util.ArrayList;

public class GayProblem {
    public static void main(String[] args) {

        System.out.println(ithFactor(10L, 5L));

    }

    public static long ithFactor(long n, long i){
        ArrayList<Long> list = new ArrayList<>();

        for(long k = 1; k<=n; k++){
            if(n % k == 0){
                list.add(k);
            }
        }

        return list.get((int) i-1);
    }

}
