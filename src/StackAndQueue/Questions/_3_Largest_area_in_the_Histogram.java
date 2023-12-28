package StackAndQueue.Questions;

import java.util.Stack;

public class _3_Largest_area_in_the_Histogram {
    public static void main(String[] args) {

    }
    public int largestArea(int[] heights){

        // first we store the right most limit
        int[] rb = new int[heights.length];
        Stack<Integer> st1 = new Stack<>();
        st1.push(heights[heights.length-1]);
        rb[heights.length-1] = heights.length;

        for (int i = heights.length-2; i>=0 ; i--) {
            while(!st1.isEmpty() && heights[i]<heights[st1.peek()]){
                st1.pop();
            }
        }

        int[] lb = new int[heights.length];
        Stack<Integer> st2 = new Stack<>();
        st1.push(heights[0]);
        lb[0] = -1;

    return -1;
    }
}
