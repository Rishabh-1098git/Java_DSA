package Recursion.String_Questions;

import java.util.ArrayList;

public class _06_Permutations {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String>ans = permutations2(str,"");
        System.out.println(ans);
        System.out.println(permutationsCount(str,""));
    }
    static void permutations(String str, String p){
        // base condition
        if(str.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(str.substring(1),f+ch+s);
        }
    }
    static ArrayList<String> permutations2(String str, String p){

        if(str.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            list.addAll(permutations2(str.substring(1),f+ch+s));
        }
        return list;
    }

    static int permutationsCount(String str, String p){
        // base condition
        if(str.isEmpty()){
            return 1;
        }
        int count=0;
        char ch = str.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count   = count + permutationsCount(str.substring(1),f+ch+s);
        }
        return count;
    }
}
