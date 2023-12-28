package StackAndQueue.Queue;

import StackAndQueue.Stack.StackException;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int item){
        if (this.isFull()){
            System.out.println("Queue is full!!!");
            return;
        }
        this.data[++end] = item;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new StackException("Queue is full!!!");
        }
        int removed = data[0];

        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new StackException("Queue is Empty!!!");
        }
        return data[0];
    }
    public void display() throws StackException {
        if(isEmpty()){
            System.out.println("Queue is empty!!!");
            return;
        }
        else {
            for (int i = 0; i < end; i++) {
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
    }

    public boolean isFull(){
        return end == data.length-1; // ptr is at last index
    }
    public boolean isEmpty(){return end == -1;}

}
