package OOPS._05_Polymorphism._03_Run_Time_POlymorsphism.Static_Method_Overriding;

public class Child_Class extends Parent_Class{
    @Override
    void greetings() {
        System.out.println("Wassup, Im a Child");
    }

    //    @Override
    static void info() {
        System.out.println("I am a Child");
    }
}
