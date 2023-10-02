package OOPS.MultiThreading;

public class Stack {
    private int[] array;
    private int stackTop;

    final Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop=-1;
        lock = new Object();
    }
    public boolean isEmpty(){
        return stackTop<0;
    }

    public boolean isFull(){
        return stackTop> array.length-1;
    }

//    public int pop(){
//        synchronized (lock) {
//            if (isEmpty()) return Integer.MIN_VALUE;
//
//            int obj = array[stackTop];
//
//            array[stackTop] = Integer.MIN_VALUE;
//
//            try {
//                {
//                    Thread.sleep(1000);
//                }
//            } catch (Exception ignored) {
//            }
//            stackTop--;
//
//            return obj;
//        }
//    }

//    public boolean push(int element){
//        synchronized (lock) {
//            if (isFull()) return false;
//            ++stackTop;
//
//            try {
//                {
//                    Thread.sleep(1000);
//                }
//            } catch (Exception ignored) {
//            }
//
//            array[stackTop] = element;
//            return true;
//        }
//    }


    // if we want to make the whole method synchronised then we can use synchronised keyword in the method itself
    // and we do not need to pass the lock object explicitly, reference of current object will be passed
    public synchronized int pop(){
        synchronized (this) {
            if (isEmpty()) return Integer.MIN_VALUE;

            int obj = array[stackTop];

            array[stackTop] = Integer.MIN_VALUE;

            try {
                {
                    Thread.sleep(1000);
                }
            } catch (Exception ignored) {
            }
            stackTop--;

            return obj;
        }
    }

    public synchronized boolean push(int element){
            if (isFull()) return false;
            ++stackTop;

            try {
                {
                    Thread.sleep(1000);
                }
            } catch (Exception ignored) {
            }

            array[stackTop] = element;
            return true;
    }



}
