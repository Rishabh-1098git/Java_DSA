package Recursion._10_Days_Recursion_Challenge_;
import java.util.ArrayList;
import java.util.List;
public class _05_Binary_String_No_Consecutive_Ones {
    public static void main(String[] args) {
        System.out.println(solution("",4,0));
    }
    static List<String> solution(String str,int len,int count){
        List<String> list = new ArrayList<>();
        if(len==count){
            list.add(str);
            return list;
        }
        if (str.length()==0){
            List<String> list1 = new ArrayList<>();
            list.addAll(solution(str+"0",len,count+1));
            list.addAll(solution(str+"1",len,count+1));
        }
        if(!str.isEmpty() && str.charAt(str.length()-1) != '1' ){
            List<String> list1 = new ArrayList<>();
            list.addAll(solution(str+"0",len,count+1));
            list.addAll(solution(str+"1",len,count+1));
        }
        if(!str.isEmpty() && str.charAt(str.length()-1) == '1'){
            List<String> list1 = new ArrayList<>();
            list.addAll(solution(str+"0",len,count+1));
        }
        return list;
    }
}
