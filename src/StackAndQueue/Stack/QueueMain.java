package StackAndQueue.Stack;

import StackAndQueue.Queue.CustomQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue cq = new CustomQueue(5);
        for (int i = 0; i < 5; i++) {
            cq.insert(i+1);
        }
        cq.display();
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        System.out.println(cq.pop());
//        System.out.println(cq.pop());

    }
}
