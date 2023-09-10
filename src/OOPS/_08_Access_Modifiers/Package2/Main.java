package OOPS._08_Access_Modifiers.Package2;

import OOPS._08_Access_Modifiers.Package1.Parent;

public class Main extends Parent {
    public Main(int num1, int num2, int num3, int num4) {
        super(num1, num2, num3, num4);
    }

    public static void main(String[] args) {
        Main obj = new Main(1,2,3,4);
        System.out.println(obj.num1);
//        System.out.println(obj.num2); // Default variable cannot be accessed out side the package
//        System.out.println(obj.num3);
        System.out.println(obj.num4);
    }
}
