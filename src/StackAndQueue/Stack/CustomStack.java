package StackAndQueue.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack is Full!!");
            return;
        }
        ptr++;
        data[ptr] = item;
    }
    public boolean isFull(){
        return ptr == data.length-1; // ptr is at last index
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty!!!");
        }
        return data[ptr];
    }
}
