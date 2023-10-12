package OOPS._02_SingletonClass;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();
        // all three reference variable are pointing to same object
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
