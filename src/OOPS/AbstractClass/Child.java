package OOPS.AbstractClass;

public class Child extends Parent{
    Child(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be a "+name);
    }

    @Override
    void partner(String name) {
        System.out.println("I love "+name);
    }
}
