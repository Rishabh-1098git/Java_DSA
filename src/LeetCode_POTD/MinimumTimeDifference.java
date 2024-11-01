package LeetCode_POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("17:41");
        list.add("22:06");
        list.add("20:59");
        list.add("17:37");
        list.add("04:14");

        Collections.sort(list);

        System.out.println(list);

        System.out.println("ANS : " + findMinDifference(list));

//        System.out.println(getTimeDiff(list, 0, list.size()-1 ));

    }

    public static int findMinDifference(List<String> timePoints) {

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < timePoints.size()-1; i++) {
            ans = Math.min(ans, getTimeDiff(timePoints,i,i+1));
        }

        ans = Math.min(ans, getTimeDiff(timePoints,0,timePoints.size()-1));

        return ans;

    }

    public static int getTimeDiff(List<String> timePoints, int i, int j) {

        String[] arr1 = timePoints.get(i).split(":");
        int hours1 = Integer.parseInt(arr1[0]);
        int min1 = Integer.parseInt(arr1[1]);
        int totalTime1 = hours1 * 60 + min1;


        String[] arr2 = timePoints.get(j).split(":");
        int hours2 = Integer.parseInt(arr2[0]);
        int min2 = Integer.parseInt(arr2[1]);
        int totalTime2 = hours2 * 60 + min2;


        int diff = Math.abs(totalTime1 - totalTime2);
        int circularDiff = 1440 - diff;


        return Math.min(diff, circularDiff);
    }
}
