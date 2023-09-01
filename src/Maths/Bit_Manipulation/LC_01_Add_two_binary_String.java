package Maths.Bit_Manipulation;

public class LC_01_Add_two_binary_String {
    public static void main(String[] args) {
        String s1 = "1010";
        String s2 = "1011";
//        int d1 = get_decimal_value(s1);
//        System.out.println(d1);
//        int d2 = get_decimal_value(s2);
//        System.out.println(d2);
//        System.out.println(get_decimal_value(s1));
//        int add_d = d1+d2;

//        System.out.println(get_binary_value(add_d));
        System.out.println(binary_sum(s1,s2));

    }

    static String binary_sum(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry =0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0) sum+=s1.charAt(i--)-48;
            if(j>=0) sum+=s2.charAt(j--)-48;
            carry = sum>1 ? 1:0;
            sb.append(sum%2);
        }
        if (carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    static int get_decimal_value(String n){
        int ans = 0;
        int p=0;
        for (int i = 0; i <n.length() ; i++) {
            int bit = (int)n.charAt(n.length()-1-i)-48;
            ans+=bit*Math.pow(2,p++);
        }
        return ans;
    }
    static String get_binary_value(int n){
        StringBuilder s = new StringBuilder();
        while(n>0){
            int lsb = n&1;
            s.append(lsb+"");
            n = n>>1;
        }
        return s.reverse().toString();
    }

}
