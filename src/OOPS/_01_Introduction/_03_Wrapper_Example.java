package OOPS._01_Introduction;

public class _03_Wrapper_Example {
    public static void main(String[] args) {
//        int a =10;
//        int b =20;
//        swap1(a,b);
//        System.out.println(a+" "+b);
        // values not changed bcz int is a primitive and is passed by value
        // and object are passed by reference

        // now lets try to swap Integer objects
        Integer a1 = 22;
        Integer b1 = 44;
        swap2(a1,b1);
        System.out.println(a1+" "+b1);
        // Still not swapping bcz Integer class is final ==> what is final?
    }
    static void swap1(int a, int b){
        int temp = b;
        b = a;
        a = temp;
    }
    static void swap2(Integer a1, Integer b1){
        int temp = a1;
        a1 = b1;
        b1 = temp;
    }
}
