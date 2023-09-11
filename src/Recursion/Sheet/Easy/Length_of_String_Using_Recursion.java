package Recursion.Sheet.Easy;

public class Length_of_String_Using_Recursion {
    public static void main(String[] args) {
        String str = "Rishabh_Saini";
        System.out.println(len(str));
    }
    static int len(String str){
        if(str==""){
            return 0;
        }
        return 1+len(str.substring(1));
    }
}
