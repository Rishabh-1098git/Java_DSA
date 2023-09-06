package OOPS.Static_Example;

public class StaticBlock {
    static int a=4;
    static int b;

    // static block ==> will be executed once when the class is loaded,
    static {
        System.out.println("Inside the static block.");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println("a = "+StaticBlock.a+" b = "+StaticBlock.b);
        StaticBlock.a +=3;
        // static block will not be called for obj1
        StaticBlock obj1 = new StaticBlock();
        System.out.println("a = "+StaticBlock.a+" b = "+StaticBlock.b);
    }
}
