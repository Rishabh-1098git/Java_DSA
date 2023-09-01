package OOPS;

public class _01_Introduction {
    public static void main(String[] args) {
        // declaring object of class Student
        Student student2;
        // initialising the object
        student2 = new Student();

        // check what is the default value of student obj
        // System.out.println(student2);

        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        student2.rno = 62;
        student2.name = "Rishabh Saini";
        student2.marks = 85.56f;

        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);
    }
}
// Creating a class ==>
class Student{
    int rno;
    String name;
    float marks;
}