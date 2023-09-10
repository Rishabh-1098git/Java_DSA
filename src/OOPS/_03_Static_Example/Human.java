package OOPS._03_Static_Example;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    int population=0;
    static int population1=0;

    public Human(String name, int age, int salary, boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        this.population+=1;
        Human.population1+=1;
    }
}
