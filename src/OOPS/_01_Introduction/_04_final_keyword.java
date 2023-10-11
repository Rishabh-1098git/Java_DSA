package OOPS._01_Introduction;
public class _04_final_keyword {
    public static void main(String[] args) {
        final int a = 25;
//        a=34; // cannot change the value of primitive type
        final A firstobj = new A("Rishabh");
        firstobj.name = "David Jones";

        // when a non primitive is final,you cannot reassign it
//        firstobj = new A("Chandan");
    }
}
class A{
    final int num =23;
    String name;
    public A(String name){
        this.name = name;
    }
}
