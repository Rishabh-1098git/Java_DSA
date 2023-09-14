import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Rough1 {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            int[] arr = {1,1,1,3};
//            for (int i = 0; i < arr.length ; i++) {
//                list.add(arr[i]);
//            }
//            System.out.println(maxSum(list,3,4));
            System.out.println(count_unique(arr,2,3,2));
        }
        public static long maxSum(List<Integer> nums, int m, int k) {
            int[] arr = new int[nums.size()];
            for(int i=0;i<nums.size();i++){
                arr[i] = nums.get(i);
            }
            return (long)maximum_sum(arr,m,k);
        }
        static int maximum_sum(int[]arr,int m, int k){
            int maxi=Integer.MIN_VALUE;
            boolean flag = false;
            for (int i = 0; i <= arr.length-k; i++) {
                int end = i+k-1;
                if(unique_elements(arr,i,end,m)){
                    maxi = Math.max(maxi,sum(arr,i,end));
                    flag = true;
                }
            }
            if(flag){
                return maxi;
            }
            return 0;
        }
        static boolean unique_elements(int[]arr,int s, int e ,int m){
            List<Integer> list = new ArrayList<>();
            for (int i = s; i <= e ; i++) {
                list.add(arr[i]);
            }
//            int[]temp = arr.clone();
//            Arrays.sort(temp);
            int count=0;

            int i=s;
            while(i<=e) {
                if(i==s){
                    i++;
                    count++;
                    continue;
                }
                if(!list.contains(arr[i])){
                    i++;
                }
                else{
                    count++;
                    i++;
                }
            }
            return count>=m;
        }
        static boolean count_unique(int[] arr, int s, int e, int m){
            int[] temp = new int[e-s+1];
            for (int i = s; i <=e ; i++) {
                temp[i] = (arr[i]);
            }
            Arrays.sort(temp);
            int count=0;
            int i=0;
            while(i<=e){
                if(i==0){
                    i++;
                    count++;
                }
                if(temp[i]==temp[i-1]){
                    i++;
                }
                else{
                    count++;
                    i++;
                }
            }
            return count>=m;
        }

        static int sum(int[] arr, int s , int e){
            int sum=0;

            for (int i = s; i <=e ; i++) {
                sum+=arr[i];
            }
            return sum;
        }
    }

