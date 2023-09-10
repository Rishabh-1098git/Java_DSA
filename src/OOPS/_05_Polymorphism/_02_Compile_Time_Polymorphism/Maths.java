package OOPS._05_Polymorphism._02_Compile_Time_Polymorphism;

public class Maths {
    int sum (int a, int b){
        return a+b;
    }

    // this method is overloaded ==> Method Overloading
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Maths obj = new Maths();
        obj.sum(2,3);
        obj.sum(2,3,4);
    }
}
