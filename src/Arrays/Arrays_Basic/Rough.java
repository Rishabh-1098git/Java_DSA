package Arrays.Arrays_Basic;

public class Rough {
    public static void main(String[] args) {
        System.out.println(1^2);
    }
    static int countChars(String str, char ch){
        int n=str.length();
        int i=0;
        int count =0;
        while(i<n){
            if(ch==str.charAt(i)){
                count++;
            }
            i++;
        }
        return count;
    }

    static boolean isLongPressedName(String name, String typed){
        int l=typed.length();
        int i=0;
        while(i<l){
            if(countChars(name,typed.charAt(i))>countChars(typed,typed.charAt(i))){
                return false;
            }
            i++;
        }
        return true;
    }

}
