package OOPS._05_Polymorphism._03_Run_Time_POlymorsphism;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.info(); // info() method of Circle class overrides info() method of
                   // parent Shapes class

        Shapes s1 = new Circle();
        s1.info();

        // Note: which properties can be accessed depends upon the type of reference variable
        //       but which method will be called depends upon the object.


    }
}
