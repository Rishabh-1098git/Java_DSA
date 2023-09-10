package OOPS._08_Access_Modifiers.Package1;

public class Parent {
    public int num1;
    int num2; // default
    private int num3;
    protected int num4;

    public Parent(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public static void main(String[] args) {
        Parent obj = new Parent(1,2,3,4);
        // All 4 variables can be accessed within the same class.
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        System.out.println(obj.num3);
        System.out.println(obj.num4);
    }
}
