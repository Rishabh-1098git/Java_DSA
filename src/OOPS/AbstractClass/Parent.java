package OOPS.AbstractClass;

public abstract class Parent {
    int age;
    // can we create a constructor of Abstract class
    // ==> we can create constructor of Abstract class
    Parent(int age){
        this.age =age;
    }

    // can we create a abstract constructor
    // ==> no we cannot
//    abstract Parent(){} // no we cannot

    // can we have abstract static methods ==> abstract methods are the methods that
    // are to be overridden but we cannot override static methods as they are not
    // dependent on the instance of a class, they are instance independent

    // can we create normal methods inside abstract class
    static void greetings(){
        System.out.println("Hello!!!");
    }

    abstract void career(String name);
    abstract void partner(String name);
}
