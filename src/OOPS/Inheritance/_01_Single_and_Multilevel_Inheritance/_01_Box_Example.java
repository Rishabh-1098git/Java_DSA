package OOPS.Inheritance._01_Single_and_Multilevel_Inheritance;
class Box{
    int h;
    int b;
    int l;
    // constructor 1 ==> when no argument is passed
    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    // constructor 2 ==> cube
    Box(int side){
        this.l=side;
        this.h=side;
        this.b=side;
    }

    // constructor 3 ==> when three arguments are passed
    Box(int l, int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    // constructor 4 ==> when object is passed as an argument
    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
    void box_info(){
        System.out.println("Length: "+this.l);
        System.out.println("Breadth: "+this.b);
        System.out.println("Height: "+this.h);
    }

}

class ExtendedBox extends Box{
        double weight;
        ExtendedBox(int weight){
            this.weight = weight;
        }
}
// Super keyword ==>
class ExtendedBox2 extends Box{
    int weight;
    ExtendedBox2(int l, int b, int h, int weight){
        super(l,b,h); // call the parent class constructor
        // use to initialise values present in parent class
        this.weight = weight;
    }
    ExtendedBox2(ExtendedBox2 other){
        super(other); // same as Box obj = new ExtendedBox2(l,b,h);
        this.weight = other.weight;
    }
    void box_info(){
        super.box_info();
        System.out.println("Weight: "+this.weight);
    }
}
public class _01_Box_Example {
    public static void main(String[] args) {
//        System.out.println("Box 1");
//        Box obj1 = new Box();
//        obj1.box_info();
//
//        System.out.println("\nBox 2");
//        Box obj2 = new Box(10);
//        obj2.box_info();
//
//        System.out.println("\nBox 3");
//        Box obj3 = new Box(1,3,8);
//        obj3.box_info();

//        System.out.println("\nBox 4");
//        Box obj4 = new Box(obj1);
//        obj4.box_info();

//        ExtendedBox box1 = new ExtendedBox(24);
//        box1.l = 21;
//        box1.h = 23;
//        box1.b = 45;
//        box1.box_info();

        ExtendedBox2 box2 = new ExtendedBox2(2,3,4,45);
        box2.box_info();

        // it is the type of reference variable that determines what variable can be
        // accessed
        Box obj1 = new ExtendedBox2(3,4,5,6);
        System.out.println(obj1.h); // can be accessed
//        System.out.println(obj1.weight); // cannot be accessed


        // here according to the type reference variable we can access l, b, h and
        // weight but to access it , it must be initialised but constructor of box two
        // have no idea about the weight variable so it is giving error.

//        ExtendedBox2 obj2 = new Box(1,2,3);// error

    }
}
