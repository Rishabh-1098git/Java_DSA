package OOPS._08_Access_Modifiers.Package1;

public class Child extends Parent {
    public Child(int num1, int num2, int num3, int num4) {
        super(num1, num2, num3, num4);
    }

    public static void main(String[] args) {
        Child obj = new Child(1,2,3,4);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
//        System.out.println(obj.num3); // private variable cannot be accessed outside the class
        System.out.println(obj.num4);
    }
}
