package OOPS._02_SingletonClass;

public class SingletonClass {
    private int num =5;
    private SingletonClass(){

    }
    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}
