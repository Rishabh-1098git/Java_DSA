package OOPS;

public class _05_Garbage_Collection_finalise_keyword {
    public static void main(String[] args) {
        DavidJones obj;
        for (int i = 0; i <1000000000 ; i++) {
            obj = new DavidJones("Chacha Vidhayak");
        }
    }
}
class DavidJones{
    String name;
    DavidJones(String name){
        System.out.println("Object is created!!!");
        this.name = name;
    }
    // this is called whenever object is cleared by Garbage Collector
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
