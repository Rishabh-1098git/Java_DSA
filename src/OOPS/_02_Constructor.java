package OOPS;
import java.util.Scanner;
public class _02_Constructor {
    public static void main(String[] args) {
        // creating a object ==>
//        Employee e1 = new Employee(); // constructor is called automatically
//        e1.display_info();

        Employee e2 = new Employee("David Jones", 20, "0221CSML174", 12000);
        e2.display_info();

        // Note:==> in case of e1 first constructor is called while in case
        // of e2 second constructor is called this is called constructor
        // overloading.

        Employee e3 = new Employee(e2);
        e3.display_info();

        // Memory Allocation of new object ==>
        Employee one = new Employee();
        Employee two = one; // two and one both pointing to same object.
        one.name  = "Rumi";
        System.out.println(two.name);
        System.out.println(one.name);

    }
}

// Creating a class Student
class Employee {
    String name;
    int age;
    String id;
    float salary;
    // constructor
//    Employee(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        this.name = sc.nextLine();
//        System.out.print("Enter your age: ");
//        this.age = sc.nextInt();
//        System.out.print("Enter your Salary: ");
//        this.salary = sc.nextFloat();
//        System.out.print("Enter your id: ");
//        this.id = sc.next();
//    }
    // parametrised constructor ==>
    Employee(String name, int age, String id, float salary){
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }
    // Constructor that takes value from other object
    Employee(Employee other){
        this.name = other.name;
        this.salary = other.salary;
        this.age = other.age;
        this.id = other.id;
    }
    // Calling a constructor from another constructor ==>
    Employee(){
        this("Rishabh",20,"0221CSMl174",1200045);
    }
    void display_info() {
        System.out.println("\nEmployee's Information :");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("ID: "+this.id);
        System.out.println("Salary: "+this.salary);
    }
}