package Maths.Maths2;

public class LC_03_Kth_Bit_in_i_nth_Binary_String {
    public static void main(String[] args) {
        int n =5;
        int k =3;
        System.out.println(Sn(4).charAt(k-1)+"");

    }
    static String Sn(int n){
        if(n==1){
            return "0";
        }
        return Sn(n-1)+"1"+reverse(invert(Sn(n-1)));
    }

    private static String invert(String sn) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <sn.length() ; i++) {
            if(sn.charAt(i)=='1'){
                sb.append('0');
            }
            else {
                sb.append('1');
            }
        }
        return sb.toString();
    }

    static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            sb.append(s.charAt(s.length()-i-1));
        }
        return sb.toString();
    }
}
