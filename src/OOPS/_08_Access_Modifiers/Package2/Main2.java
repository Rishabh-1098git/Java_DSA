package OOPS._08_Access_Modifiers.Package2;

import OOPS._08_Access_Modifiers.Package1.Parent;

public class Main2 {
    public static void main(String[] args) {
        Parent obj = new Parent(1,2,3,4);
        System.out.println(obj.num1);
//        System.out.println(obj.num2);
//        System.out.println(obj.num3);
//        System.out.println(obj.num4); // protected variable cannot be accessible out package if not inherited
                                      // from the class in which it is defined protected
    }
}
