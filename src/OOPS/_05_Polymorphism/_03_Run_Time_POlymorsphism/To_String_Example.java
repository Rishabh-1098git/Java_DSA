package OOPS._05_Polymorphism._03_Run_Time_POlymorsphism;

public class To_String_Example {
    int num;
    To_String_Example(int num){
        this.num = num;
    }

    // our own toString() Method that overrides Object class toString() Method
    // at run time is determined that this toString() method is to executed
    @Override
    public String toString() {
        return "To_String_Example{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        To_String_Example obj = new To_String_Example(34);

//        System.out.println(obj); // it is calling obj.toString() function of parent class
        // that is Object class

        // but what if we have our own toString() function
        // now our toString() method overrides the toString() method of object class
        System.out.println(obj);
    }
}
