package Strings;

public class _08_Palindrome_question {
    public static void main(String[] args) {
        String str = "ABCDCBAQ";
        int s=0;
        int e=str.length()-1;
        boolean isPalindrome = true;

        while(s<e){
            if(str.charAt(s)!= str.charAt(e)){
                isPalindrome= false;
                break;
            }
            else{
                s++;
                e--;
            }
        }
        System.out.println(isPalindrome);


        String str1 = "A man, a plan, a canal: Panama";
        String str2 = str1.toLowerCase();
        String str5 = str2.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str5.replaceAll(" ",""));


    }
}
