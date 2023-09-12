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


        // Important point on protected Variable
        // 1. If we try to access protected variable through obj of sub class
        Main demo1 = new Main(2,3,4,5);
        System.out.println("demo1.num4 = "+demo1.num4);
        // we can access through obj of Main class

        // 2. If we try to access protected variable through obj of parent class
        Parent demo2 = new Parent(1,2,3,4);
//        System.out.println("demo2.num4 = "+demo2.num4);

        // ==> we cannot access protected variable through Parent obj
        // bcz if we can access it through Parent class object in another
        // package ==> then it would be similar to as public variable

        // we can only access protected variable in another package if accessed
        // through subclass of parent class


    }
}
