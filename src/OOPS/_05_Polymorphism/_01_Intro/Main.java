package OOPS._05_Polymorphism._01_Intro;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.info();
        square.info();

        Shapes obj = new Triangle();
        obj.info();

    }
}
