package OOPS.MultiThreading;

public class ThreadTester {
    public static void main(String[] args) {
//        // Implementing method-1 of creating threads
//        System.out.println("Thread 1 Starting...");
//        Thread1 thread1 = new Thread1("thread1");
//        thread1.start();
//        System.out.println("Thread1 Exiting...");
//
//        // Implementing method-2 of creating threads
//        System.out.println("Thread2 Starting...");
//        Thread thread2 = new Thread(new Thread2(), "thread2");
//        thread2.start();
//        System.out.println("Thread2 Exiting...");


        // Implementing Daemon thread
        Thread1 thread3 = new Thread1("thread-3");
        thread3.setDaemon(true);
        System.out.println("Starting thread-3");
        thread3.start();
        System.out.println("Exiting thread-3");

    }
}
