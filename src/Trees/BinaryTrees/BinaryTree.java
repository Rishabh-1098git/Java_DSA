package Trees.BinaryTrees;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public Node root;

    // Insert Element
    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    public void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of "+node.val);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of"+node.val);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }

        System.out.println("Dou you want to enter right of "+node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of"+node.val);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(root,"");
    }
    public void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.val+"\t");
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
    // pretty printing
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    public void prettyDisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);

        if(level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.val);
        }
        else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }

    public void preOrder(Node root ){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    // BFS
    public void bfs(){
        bfs(root);
    }
    private void bfs(Node root){
        Queue<Node> queue = new PriorityQueue<>();
        queue.add(root);

        while(!queue.isEmpty()){
            System.out.print(queue.peek()+"-->");
            if(root.left != null) queue.add(root.left);
            if(root.right!=null) queue.add(root.right);
            queue.remove();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.prettyDisplay();
        bt.bfs();
    }
}
