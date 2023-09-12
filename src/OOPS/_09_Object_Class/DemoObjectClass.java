package OOPS._09_Object_Class;

public class DemoObjectClass {
    int num;

    public DemoObjectClass(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Jai Shree Ram";
    }

    // hash code represents unique identity of an object through a number
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // already covered this
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((DemoObjectClass)obj).num;
    }

    public static void main(String[] args) {
        DemoObjectClass obj1 = new DemoObjectClass(23);
        System.out.println(obj1.hashCode());
        DemoObjectClass obj2 = new DemoObjectClass(23);
        System.out.println(obj2.hashCode());

        DemoObjectClass obj3 = obj2;
        System.out.println(obj3.hashCode()); //same hashcode as obj2 as obj is same

        if(obj1 == obj2){
            System.out.println("both are pointing to same object");
        }
        if(obj1.equals(obj2)){
            System.out.println("Values of both are equal !!");
        }

        // instanceof ==> checks if the obj is the instance of the specified class
        System.out.println(obj1 instanceof DemoObjectClass);

        // getClass ==> gives the class of the instance
        System.out.println(obj1.getClass());
    }

}
