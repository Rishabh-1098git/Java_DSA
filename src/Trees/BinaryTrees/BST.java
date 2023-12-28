package Trees.BinaryTrees;

public class BST {
    private class Node{
        private int val;
        int height;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }
        public int getValue(){
            return val;
        }
    }
    private Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root, "Root Node: ");
    }
    public void display(Node node, String details){
        if(node==null){
            return ;
        }
        System.out.println(details+node.getValue());

        display(node.left,"Left child of "+node.getValue()+" : ");
        display(node.right,"Right child of "+node.getValue()+" : ");
    }
    public void insert(int item){
        root = insert(root, item);
    }
    public Node insert(Node node, int item){
        if(node==null){
            node = new Node(item);
            return node;
        }
        if(item<node.val){
            node.left = insert(node.left, item);
        }
        if(item>node.val){
            node.right = insert(node.right, item);
        }
        node.height = Math.max(height(node.left),height(node.right));

        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.right) && balanced(node.left);
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    // for populating sorted array
    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    public void populateSorted(int[] nums, int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;

        this.insert(nums[mid]);

        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }

    // preorder Traversal
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    public static void main(String[] args) {
        BST tree = new BST();
//        int[] nums = {5,2,7,1,4,6,9,8,3,10};
//        tree.populate(nums);
//        tree.display();

        int[]nums = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(nums);
        tree.display();
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
}
