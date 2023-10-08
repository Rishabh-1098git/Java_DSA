package Recursion._10_Days_Recursion_Challenge_;

public class _04_FlipGame {
    public static void main(String[] args) {
        String str = "$$$$$";
        System.out.println(canNinjaWin(str));
    }
    static boolean canNinjaWin(String str){
           if(str.length()<2){
               return false;
           }

        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)=='$' && str.charAt(i+1)=='$'){
                String changedStr = str.substring(0,i)+"**"+str.substring(i+2);
                if(!canNinjaWin(changedStr)){
                    return true;
                }
            }
        }
        return false;
    }
}
