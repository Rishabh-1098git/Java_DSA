package OOPS.Inheritance._01_Single_and_Multilevel_Inheritance;

public class _02_Box_Price_Multilevel_Inheritance {
    public static void main(String[] args) {
        Box_Price box= new Box_Price(1,2,4,45,1000);
        box.box_info();
    }

}
// Box --> ExtendedBox --> Box_Price
class Box_Price extends ExtendedBox2 {
    double cost;
    Box_Price(int l, int b, int h, int weight, double cost) {
        super(l, b, h, weight);
        this.cost = cost;
    }
    void box_info(){
        super.box_info();
        System.out.println("Cost: "+this.cost);
    }
}