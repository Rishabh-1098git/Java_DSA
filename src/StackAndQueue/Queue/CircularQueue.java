package StackAndQueue.Queue;

import StackAndQueue.Stack.StackException;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length; // ptr is at last index
    }
    public boolean isEmpty(){return size == 0;}

    public boolean insert(int item) throws StackException {
        if(isFull()){
            throw new StackException("Stack is full!!!");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty!!!");
        }
        int removed = data[front++];
        front  = front % data.length;
        size--;
        return removed;
    }

    public int front() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty!!!");
        }
        return data[front];
    }

    public void display(){
        int i = front;
        do{
            System.out.print(data[i]+ " <- ");
            i++;
            i %=data.length;
        }while(i!=end);
        System.out.println("END");
    }
}
