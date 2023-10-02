package OOPS.Generics;

public class Cat extends Animals {
    String name;
    Cat(String type, String gender,String name) {
        super(type, gender);
        this.name = name;
    }
    public void speak(){
        System.out.println("Meaaauu...");
    }

}
