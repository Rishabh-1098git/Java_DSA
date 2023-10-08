package Recursion._10_Days_Recursion_Challenge_;

public class _01_Remove_Consecutive_Duplicates {
    public static void main(String[] args) {
        String str = "aazbbby";
        System.out.println(removeDuplicates(str,"",0));
    }
    static String removeDuplicates(String str,String ans, int index){
        if(index == str.length()-1){
            return ans+str.charAt(index);
        }
        if(str.charAt(index) == str.charAt(index+1)){
            return removeDuplicates(str, ans, index+1);
        }
        else{
            return removeDuplicates(str,ans+str.charAt(index),index+1);
        }
    }
}
