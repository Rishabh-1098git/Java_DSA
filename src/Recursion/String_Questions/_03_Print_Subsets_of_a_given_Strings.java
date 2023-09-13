package Recursion.String_Questions;

import java.util.ArrayList;

public class _03_Print_Subsets_of_a_given_Strings {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
//        subseq1("abcd","",list);
//        System.out.println(list);
        System.out.println(subseqRet("abcd",""));
    }

    static void subseq(String str, String subset){
        if(str.isEmpty()){
            System.out.print(subset+" ");
            return;
        }
        char ch = str.charAt(0);
        subseq(str.substring(1),subset+ch);
        subseq(str.substring(1),subset);
    }

    static void subseq1(String str, String subset, ArrayList<String> list){
        if(str.isEmpty()){
//            System.out.print(subset+" ");
            list.add(subset);
            return;
        }
        char ch = str.charAt(0);
        subseq1(str.substring(1),subset+ch,list);
        subseq1(str.substring(1),subset,list);
    }

    // to return answer in an ArrayList

    static ArrayList<String> subseqRet(String str,String subset){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(subset);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subseqRet(str.substring(1),subset+ch);
        ArrayList<String> right = subseqRet(str.substring(1),subset);

        left.addAll(right);
        return left;
    }

}
