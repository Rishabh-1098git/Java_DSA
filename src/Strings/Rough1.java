package Strings;
public class Rough1 {
    public static void main(String[] args) {
        String s = "cbbcc";
        System.out.println(valid_palindrome(s));
    }
   public static boolean valid_palindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder(s);
        int n = s.length();
        int i=0;
        int j=n-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                sb.deleteCharAt(i);
                String s1 = sb.toString();
                if(isPalindrome(s1)){
                    return true;
                }
                else {
                    sb1.deleteCharAt(j);
                    String s2 = sb1.toString();
                    if(isPalindrome(s2)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
    return true;
    }

    static boolean isPalindrome(String s){
        int n = s.length();
        int i=0;
        int j=n-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
            }
        return true;
        }

}

