package OOPS._03_Static_Example;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Rishabh",20,1200000,false);
        Human h2 = new Human("Aditi",20,100000,false);
        System.out.println(h1.population);
        System.out.println(h2.population);

        System.out.println(h1.population1);
        System.out.println(h2.population1);

//        greeting();
        // we cannot access non static methods inside static methods bcz it reqiures ans instance
        // but the function you are using it in does't depend on the instance

    }
    static void fun(){
//        greeting(); // ==> non static methods cannot used inside static methods.
        System.out.println("I am just having fun..");
    }
    // we know that something that is not static belongs to the object
    void greeting(){
        fun(); // static methods can be accessed inside non static methods
        System.out.println("Hello Coder!!!");
    }

    // to access non static methods inside static methods we need to create a object inside static method
    static void fun1(){
        Main obj = new Main();
        obj.greeting();
    }

}
