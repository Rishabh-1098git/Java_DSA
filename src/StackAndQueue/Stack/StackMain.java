package StackAndQueue.Stack;

import StackAndQueue.Stack.CustomStack;
import StackAndQueue.Stack.StackException;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
        stack.push(0);
        stack.push(0);
        stack.push(0);
        stack.push(0);
        stack.push(0);
        stack.push(0); // now the stack is full so, we have to introduce the  concept of dynamic array
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
