import java.math.BigInteger;
import java.util.*;

public class Rough1 {
    static int minLength = Integer.MAX_VALUE;
    static long totalVisits = 0;
    static HashMap<String, Integer> map = new HashMap<>();



    public static void main(String[] args) {

       String[] arr = {"/a","/a/b/c","/a/b/d"};

       Arrays.sort(arr);

        List<String> list = new ArrayList<>();

        int i=0;
        int j=1;

        while(j < arr.length){
            if(!isSubFolder(arr[i], arr[j])){
                list.add(arr[i]);
                i = j;
            }

            j++;

        }
        list.add(arr[i]);

        System.out.println(Arrays.toString(arr));

        System.out.println(list);





    }

    public static boolean isSubFolder(String str1, String str2){
        int n = str1.length();
        if(n >= str2.length()) return false;
        return str1.equals(str2.substring(0, n)) && str2.charAt(n) == '/';
    }

    public static int getMinServers(int expected_load, List<Integer> server) {
        Collections.sort(server, Collections.reverseOrder());

        int servers_chosen = 0;
        int current_load = 0;


        for (int s : server) {
            if (current_load + s > expected_load) {
                continue;
            }

            current_load += s;
            servers_chosen++;

            if (current_load == expected_load) {
                return servers_chosen;
            }
        }

        return -1;
    }

    public static int[][] merge(int[][] intervals) {

        List<List<Integer>> list = new ArrayList<>();

        int i=0;

        while(i < intervals.length-1){
            List<Integer> sublist = new ArrayList<>();
            if(intervals[i][1] >= intervals[i+1][0]){
                sublist.add(intervals[i][0]);
                sublist.add(intervals[i+1][1]);
                i+=2;
            }
            else{
                sublist.add(intervals[i][0]);
                sublist.add(intervals[i][1]);
            }
            list.add(sublist);
        }

        int [][] ans = new int[list.size()][2];

        for(int j=0; j<ans.length; j++){
            ans[j][0] = list.get(j).get(0);
            ans[j][1] = list.get(j).get(1);
        }

        return ans;
    }

    public static String makeGood(String s) {

        int i=0;
        String ans = s;

        while(i < ans.length()-1){
            String curr = ans.charAt(i)+"";
            String next = ans.charAt(i+1)+"";
            if(curr.charAt(0) == next.charAt(0)){
                i++;
                continue;

            }

            if(curr.toLowerCase().charAt(0) == next.charAt(0) || curr.charAt(0) == next.toLowerCase().charAt(0)){
                ans = ans.substring(0,i)+ans.substring(i+2);
                i = 0;
            }
            else{
                i++;
            }

        }

        return ans;

    }

    public static long countAlternatingSubarrays(int[] arr) {

        long count = 0;

        int i=0, j=0;

        while(j < arr.length){
            if(j>i && arr[j] == arr[j-1]){
                i = j;
            }

            count += j-i+1;
            j++;
        }

        return count;

    }

    public static int maxBottlesDrunk(int numBottles, int numExchange) {

        int BottlesDrunk = 0;
        int emptyBottles = 0;

        while(true){
            if(numBottles != 0){
                BottlesDrunk += numBottles;
                emptyBottles+=numBottles;
                numBottles = 0;
            }
            if(numExchange <= emptyBottles){
                emptyBottles -= numExchange;
                numExchange += 1;
                numBottles += 1;
            }

            if(numBottles == 0 && numExchange>emptyBottles){
                break;
            }
        }

        return BottlesDrunk+numBottles;
    }



    public static int minimumSubarrayLength(int[] nums, int k) {

        int minLen = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int OR = 0;

        while (j < nums.length) {
            OR |= nums[j];

            while (i <= j && OR >= k) {
                minLen = Math.min(minLen, j - i + 1);
                OR = OR ^ nums[i];
                i++;
            }

            if(j == nums.length-1 && i==0){
                while(OR >= k){
                    OR ^= nums[i];
                    i++;
                    minLen = Math.min(minLen, j - i + 1);
                }
            }

            j++;

        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        if(nums.length == 1 && k==1){
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        int i =0;
        int j =0;

        int maxi = 0;

        while(j < nums.length){
            if(!map.containsKey(nums[j])){
                map.put(nums[j], 1);
                if(j == nums.length){
                    maxi = Math.max(maxi, j-i+1);
                }
            }
            else{
                if(map.get(nums[j]) < k){
                    map.put(nums[j], map.get(nums[j])+1);
                }
                else{
                    map.put(nums[j], map.get(nums[j])+1);
                    while(map.get(nums[j]) >= k){
                        map.put(nums[i], map.get(nums[i])-1);
                        i++;
                    }
                }
            }
            maxi = Math.max(maxi, j-i+1);
            j++;
        }
        return maxi;
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int count =0;

        for(int i=0; i<nums.length; i++){
            int prod = 1;

            for(int j=i; j<nums.length; j++){
                prod = prod * nums[j];
                if(prod < k){
                    count++;
                }
            }

        }

        return count;

    }

    public static long countSubstrings(String s, char c) {

        long count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }

        if(count == 1) return 1;

        count = count + count*(count-1)/2;

        return count;
    }


    static BigInteger factorial(long N)
    {
        // Initialize result
        BigInteger f
                = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

    public static boolean isSubstringPresent(String s) {

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<s.length()-1; i++){
            String substring = s.substring(i,i+2);
            map.put(substring, 1);
        }
        String rev = reverse(s);

        for(int i=0; i<rev.length()-2; i++){
            String substring = rev.substring(i,i+2);
            if(map.containsKey(substring)){
                return true;
            }
        }

        return false;

    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();

        for(int j=s.length()-1; j>=0; j--){
            sb.append(s.charAt(j));
        }

        return sb.toString();
    }


    public static long[] unmarkedSumArray(int[] nums, int[][] queries) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long [] ans = new long[queries.length];


        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        // now we have the map

        for(int i=0; i<queries.length; i++){

            int first = nums[queries[i][0]];

            if(map.get(first) > 0){
                map.put(first, map.get(first)-1);
            }
            // now populate the priority queue

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for(int j=0; j<nums.length; j++){
                if(j != queries[i][0]){
                    pq.add(nums[j]);
                }
            }

            // now we have the pQueue

            for(int k=0; k<queries[i][1]; k++){
                int ele = pq.poll();
                if(map.get(ele) > 0){
                    map.put(ele, map.get(ele)-1);
                }
            }

            // now take sum of all map elements

            long sum =0;

            for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
                int key = mapElement.getKey();

                int value = mapElement.getValue();

                sum += key*value;
            }

            ans[i] = sum;

        }

        return ans;

    }

    public static void findSubsets(int[] nums)
    {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < (1 << n); i++) {
            int mini = Integer.MAX_VALUE;
            int len = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(nums[j] + " ");
                    mini = Math.min(mini, nums[j]);
                    len+=1;
                }
            }
            System.out.println(" -> "+mini+ " len: "+len);
            System.out.println("maxStength: "+len*mini);
            max = Math.max(max, len*mini);
            System.out.println();
        }

        System.out.println("Max: "+max);
    }

    public static void calTotalVisits(int N, int M, int L,int a, int b){
            if(a<1 || a>M || b<1 || b>N){
                return;
            }
            if(map.containsKey(a+""+b)){
                return;
            }
            else{
                totalVisits++;
                map.put(a+""+b, 1);
            }

            calTotalVisits(N,M,L, a-L, b);
            calTotalVisits(N,M,L, a+L, b);
            calTotalVisits(N,M,L, a, b-L);
            calTotalVisits(N,M,L, a, b+L);

    }



    public static String lastNonEmptyString(String s) {
        String currentStr = s;

        while(true){
            HashMap<Character, Integer> mp = new HashMap<>();

            int i = 0;
            while(i < s.length()){
                if(mp.containsKey(s.charAt(i))){
                    i+=1;
                }
                else{
                    mp.put(s.charAt(i) ,1);
                    s = s.substring(0,i)+s.substring(i+1);
//                    currentStr = s;
                }
            }

            if(s.isEmpty()){
                return currentStr;
            }
            currentStr = s;
            StringBuilder sb = new StringBuilder(s);
            
        }
    }

    public static int difference(int k , int arr[]){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int min1 = Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE;

            for (int j = 0; j < arr.length; j++) {
                if(j<i ||  j>(i+k-1)){
                    min1 = Math.min(min1 , arr[j]);
                    max1 = Math.max(max1, arr[j]);
                }
            }
            min = Math.min(min, Math.abs(min1-max1));

        }
        return min;
    }
    public static long maximizeSum(int n, int[] arr){
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i=0; i<arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }

        }
        for (int i = 0; i < index; i++) {
            arr[i] = max;
        }

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;

    }
    public static int minimumCost(int[] nums) {
        int min = nums[0];

        int temp = Integer.MAX_VALUE;
        for (int j = 1; j < nums.length-1 ; j++) {
            for (int i = j; i < nums.length -1 ; i++) {
                temp = Math.min(temp, nums[j]+nums[i+1]);
            }
        }


        return min+temp;
    }
    // _02_contest
    public static boolean canSortArray(int[] arr) {
        int n=arr.length;

        boolean swapped = false;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                if(arr[j]<arr[j-1] && (count_1bits(arr[j])== count_1bits(arr[j-1]))){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return isSorted(arr);
    }
    static boolean isSorted(int[] arr){
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
    static int count_1bits(int n){
        int count=0;
        while(n>0){
            int lsb = n&1;
            if(lsb==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }



    public static void minimumArrayLength(int[] nums) {
        if(allZeroes(nums)){
            return;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }


        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[i]>0 && nums[j]>0){
                    flag = true;
                    int result = nums[i] % nums[j];
                    list.add(result);
                    list.remove(i);
                    if(i<j){
                        j = j-1;
                    }
                    list.remove(j);
                }
                minLength = Math.min(minLength, list.size());
                int[] temp = new int[list.size()];
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = list.get(k);
                }
                minimumArrayLength(temp);
            }
        }

    }

    private static boolean allZeroes(int[] nums) {
        boolean isAllZeroes = true;
        for (int num : nums) {
            if (num != 0) {
                isAllZeroes = false;
                break;
            }
        }
//        Rishabh saini testing
        return isAllZeroes;
    }
    public static void maxOperations(int[] nums) {

        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length-1; i+=2) {
            int sum = nums[i]+nums[i+1];

            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
                max = Math.max(max,map.get(sum));
            }
            else{
                map.put(sum , 1);
                max = Math.max(max,1);
            }
        }
        System.out.println(max);

    }

}

