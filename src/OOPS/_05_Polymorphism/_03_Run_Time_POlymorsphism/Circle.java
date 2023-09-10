package OOPS._05_Polymorphism._03_Run_Time_POlymorsphism;

public class Circle extends Shapes {

    // this will run when object of Circle is Created
    // Hence it is overriding the Parents Method
    @Override // this is called annotation
    void info() {
        System.out.println("Inside Circle Class");
    }
}
