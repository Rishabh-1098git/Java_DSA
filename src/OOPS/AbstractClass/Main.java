package OOPS.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Child son = new Child(24);
        son.career("Devops Engineer");
        son.partner("Aditi Rathore");

        Child daughter = new Child(24);
        daughter.career("F1 Racer");
        daughter.partner("Rishabh Saini");

//        Parent obj = new Parent(23) ;
        // we cannot create object of abstract class ==> bcz then it will call
        // abstract methods which have no body and therefore we also cannot have
        // abstract constructor.
        Parent.greetings();
    }
}
