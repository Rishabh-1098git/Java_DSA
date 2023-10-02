package OOPS.Generics;

public class AnimalsMain<T extends Animals> { // it means that the type can be of animal class

    public AnimalsMain(){
        System.out.println("Inside AnimalsMain");
    }

    public static void main(String[] args) {
        AnimalsMain<Dog> obj1 = new AnimalsMain<>();
        AnimalsMain<Cat> obj2 = new AnimalsMain<>();

        // if we try to give it some other object as T which is not of Animals, Dog or Cat
        // then it will give an Error

//        AnimalsMain<Integer> obj3 = new AnimalsMain<>(); --> Error
    }
}
