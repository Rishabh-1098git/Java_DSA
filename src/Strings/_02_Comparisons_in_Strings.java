package Strings;

public class _02_Comparisons_in_Strings {
    public static void main(String[] args) {
        String a = "Rishabh";
        String b = "Rishabh";
        String c = "rishabh";
        // == checks if the reference variable pointing o the same object ==>
        System.out.println(a==b);
        System.out.println(a==c);
        // .equals() checks the value only ==>
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        String d = new String("Rishabh");
        System.out.println(a==d);
        System.out.println(a.equals(d));
    }
}
