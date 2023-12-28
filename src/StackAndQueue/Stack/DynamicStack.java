package StackAndQueue.Stack;

import StackAndQueue.Stack.CustomStack;

public class DynamicStack extends CustomStack {

    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }

    @Override
    public void push(int item){
        if(this.isFull()){
            int [] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
    }
}
