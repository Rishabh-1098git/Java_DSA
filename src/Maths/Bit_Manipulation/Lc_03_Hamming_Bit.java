package Maths.Bit_Manipulation;

public class Lc_03_Hamming_Bit {
    public static void main(String[] args) {
        int x=1;
        int y=4;
        int count=0;
        while(x!=0 || y!=0){
            int xlsb = x&1;
            int ylsb = y&1;
            if(xlsb != ylsb){
                count++;
            }
            x = x>>>1;
            y = y>>>1;
        }
//        return count;
        System.out.println(count);
    }
}
