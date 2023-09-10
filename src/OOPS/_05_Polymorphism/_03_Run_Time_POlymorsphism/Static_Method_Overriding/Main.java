package OOPS._05_Polymorphism._03_Run_Time_POlymorsphism.Static_Method_Overriding;

public class Main {
    public static void main(String[] args) {
        Parent_Class obj = new Child_Class();
        obj.greetings(); // this get overrides
        obj.info(); // this doesn't get overrides
    }
}
