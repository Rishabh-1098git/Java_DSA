package OOPS.Generics;

public class PrinterMain {
    public static void main(String[] args) {
        Printer<Integer> obj1 = new Printer<>(23);
        obj1.print();

        Printer<String> obj2 = new Printer<>("Rishabh Saini");
        obj2.print();

        shout("Rishabh",20);
    }

    // we can also make generic methods
    private static <T,V> T shout(T thingToPrint, V OtherThingToPrint){
        System.out.println(thingToPrint);
        System.out.println(OtherThingToPrint);
        return thingToPrint;
    }
}
