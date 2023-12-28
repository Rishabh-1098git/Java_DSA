package StackAndQueue.Stack;

public class DynamicStackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack ds = new DynamicStack();
        for (int i = 0; i < 10; i++) {
            ds.push(i+1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ds.pop());
        }
    }
}
