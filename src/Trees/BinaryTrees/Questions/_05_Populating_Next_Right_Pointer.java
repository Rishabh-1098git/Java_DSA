package Trees.BinaryTrees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _05_Populating_Next_Right_Pointer {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {

            if(root==null){
                return root;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                for (int i = 0; i < levelSize; i++) {
                    Node currentNode = queue.remove();
                    if(i==levelSize-1) currentNode.next = null;
                    else currentNode.next = queue.peek();

                    if(currentNode.left != null) queue.add(currentNode.left);
                    if(currentNode.right != null) queue.add(currentNode.right);
                }
            }
            return root;
        }
    }

