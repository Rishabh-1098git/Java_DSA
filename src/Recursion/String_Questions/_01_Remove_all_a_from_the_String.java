package Recursion.String_Questions;

public class _01_Remove_all_a_from_the_String {
    public static void main(String[] args) {
        String str = "assbbaacda";
//        System.out.println(remove_a1(str,"",0));
//        System.out.println(remove_a2(str,""));
        System.out.println(remove_a3(str));
    }
    static String remove_a1(String str, String ans, int count){
        if(count==str.length()){
            return ans;
        }
        if(str.charAt(count)=='a'){
            return remove_a1(str,ans,count+1);
        }
        return remove_a1(str,ans+str.charAt(count),count+1);
    }

    static String remove_a2(String str, String ans){
        if(str.isEmpty()){
            return ans;
        }
        char ch = str.charAt(0);
        if(ch =='a'){
            return remove_a2(str.substring(1),ans);
        }
        return remove_a2(str.substring(1),ans+ch);
    }

    static String remove_a3(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch =='a'){
            return remove_a3(str.substring(1));
        }
        return ch+remove_a3(str.substring(1));
    }
}
