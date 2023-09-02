package Maths.Bit_Manipulation;

public class Lc_04_Numbers_Complement {
    public static void main(String[] args) {
//        // number's complement
//        int n=1;
//        String binary = Integer.toBinaryString(n);
//        System.out.println(binary);
//        // now we have to generate complement binary string
//        StringBuilder compl = new StringBuilder();
//        for (int i = 0; i <binary.length() ; i++) {
//            if(binary.charAt(i)=='1'){
//                compl.append('0');
//            }
//            else {
//                compl.append('1');
//            }
//        }
//        System.out.println(compl);
//        // now getting decimal form of compl string
//        int ans = 0;
//        int power=0;
//        int len = compl.length();
//        for (int i = 0; i <len ; i++) {
//            ans += (compl.charAt(len-1-i)-48)*(int)Math.pow(2,power);
//            power++;
//        }
//        System.out.println(ans);

        // bit manipulation method
        int n = 5;
        System.out.println(Integer.toBinaryString(n));
        int compl = numbers_complement(n);
        System.out.println(Integer.toBinaryString(compl));
    }
    static int numbers_complement(int n){
//        int rsb = n&(n-1);
        int i=0;
        int num=0;
        while(n>num){
            num+=Math.pow(2,i);
            i++;
        }
        return num^n;
    }

}
