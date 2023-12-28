package Trees.BinaryTrees;

public class SegmentTree{
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println(tree.query(2,6));
        tree.update(2,10);
        System.out.println(tree.query(2,6));
    }
    private class Node{
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
         // create a tree using this array
        this.root = constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            // leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = (start+end)/2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr,mid+1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }
    public int query(int qsi, int qei){
        return this.query(this.root,qsi, qei);
    }
    public int query(Node node, int qsi, int qei){
        if(node.start >= qsi && node.end <= qei){
            // node is completely inside the query
            return node.data;
        }
        else if(node.start > qei || node.end < qsi){
            return 0;
        }
        else{
            return query(node.left,qsi,qei)+query(node.right,qsi,qei);
        }
    }
    public void update(int index, int value){
        this.root.data = update(root,index,value);
    }
    public int update(Node node,int index, int value){
        if(index >= node.start && index<= node.end){
            if(index==node.start && index==node.end){
                node.data = value;
                return node.data;
            }
            else{
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);

                node.data = leftAns+rightAns;
                return node.data;
            }
        }
        return node.data;
    }

}
