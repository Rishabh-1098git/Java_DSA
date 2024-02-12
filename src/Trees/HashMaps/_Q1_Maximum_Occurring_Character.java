package Trees.HashMaps;

import java.util.HashMap;

public class _Q1_Maximum_Occurring_Character {
    public static void main(String[] args) {
        // give the maximum occurring character
        String str = "abcdabefghabcda";
        // Quadratic Solution
        // hashmap solution
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(hm.containsKey(currentChar)){
                hm.put(currentChar, hm.get(currentChar)+1);
                max = Math.max(max, hm.get(currentChar)+1);
            }
            else {
                hm.put(currentChar, 1);
                max = Math.max(max, 1);
            }
        }
        System.out.println(max);
    }
}
