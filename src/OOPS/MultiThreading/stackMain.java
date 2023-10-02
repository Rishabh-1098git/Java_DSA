package OOPS.MultiThreading;

public class stackMain {
    public static void main(String[] args) {
        System.out.println("Main is starting...");
        Stack stack = new Stack(5);

        new Thread(()->
        {
            int counter = 0;
            while(++counter <10){
                System.out.println("Pushed: "+stack.push(counter));
            }
        },"Pusher").start();

        new Thread(()->
        {
            int counter = 0;
            while(++counter < 10){
                System.out.println("Popped: "+stack.pop());
            }
        },"Popper").start();


    }
}
