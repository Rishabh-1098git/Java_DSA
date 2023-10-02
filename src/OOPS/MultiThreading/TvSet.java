package OOPS.MultiThreading;

public class TvSet {
    private static volatile TvSet isGetInstance;

    private TvSet(){
        System.out.println("Object is Created...");
    }

    public static TvSet getTvSetInstance(){
        if(isGetInstance==null){
           synchronized (TvSet.class){
               if (isGetInstance==null){
                   isGetInstance = new TvSet();
               }
           }
        }
        return isGetInstance;
    }
}
