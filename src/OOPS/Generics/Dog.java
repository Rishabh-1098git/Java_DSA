package OOPS.Generics;
public class Dog extends Animals{
    String name;
    Dog(String type, String gender,String name) {
        super(type, gender);
        this.name = name;
    }
    public void speak(){
        System.out.println("Bark...");
    }
}
