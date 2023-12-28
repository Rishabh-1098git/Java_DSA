package Trees.BinaryTrees;

public class AVL {
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

    public int height(){
        return height(root);
    }

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
        node.height = Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }

    // Rotate
     private Node rotate(Node node){
        // left heavy
        if(height(node.left) - height(node.right)>1){
            // left - left case
            if(height(node.left.left) - height(node.left.right) >0){
                return rightRotate(node);
            }
            // left - right case
            if(height(node.left.left)-height(node.right.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        // right heavy case
         if(height(node.left) - height(node.right)<-1){
             // right - right case
             if(height(node.right.left) - height(node.right.right) <0){
                 return leftRotate(node);
             }
             // right - left case
             if(height(node.right.left)-height(node.right.right) > 0){
                 node.right = rightRotate(node.right);
                 return leftRotate(node);
             }
         }
         return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;

        return c;
    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);

        return p;
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
        AVL tree = new AVL();
        for (int i = 1; i <=10 ; i++) {
            tree.insert(i);
        }
        System.out.println(tree.height());
        tree.display();

    }
}
