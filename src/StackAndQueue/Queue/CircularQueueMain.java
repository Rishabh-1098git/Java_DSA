package StackAndQueue.Queue;

import StackAndQueue.Stack.StackException;

import java.util.Stack;

public class CircularQueueMain {
    public static void main(String[] args) throws StackException {
        CircularQueue cq = new CircularQueue(5);
        cq.insert(3);
        cq.insert(2);
        cq.insert(4);
        cq.insert(5);
        cq.insert(7);

        cq.display();

        System.out.println(cq.remove());

        cq.insert(777);
        cq.display();

        cq.display();
    }
}
