package Recursion._10_Days_Recursion_Challenge_;

public class _04_FlipGame {
    public static void main(String[] args) {
        String str = "$$**";
        System.out.println(canWin(str,0,true));
    }
    static boolean canWin(String str, int count, boolean flag){
        if(flag == true){
            return count % 2 != 0;
        }

        flag = false;

        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)=='$' && str.charAt(i+1)=='$'){
                flag = true;
                return canWin(str.substring(0,i)+'*'+'*'+str.substring(i+2),count+1,flag);
            }
        }
        return canWin(str,count+1, flag);

    }
}
