package Recursion.Sheet.Easy;

public class Balanced_Parenthesis {
    public static void main(String[] args) {
            String str = "{([])}";
        System.out.println(parenthesis(str, 0, str.length()-1));
    }
    static boolean parenthesis(String str, int s, int e){
        if(s>e){
            return true;
        }
        if(str.charAt(s)=='{' && str.charAt(e)!='}'){
            return false;
        }
        if(str.charAt(s)=='(' && str.charAt(e)!=')'){
            return false;
        }
        if(str.charAt(s)=='[' && str.charAt(e)!=']'){
            return false;
        }

        return parenthesis(str,s+1,e-1);
    }
}
