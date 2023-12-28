package Trees.BinaryTrees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _03_LevelOrderSuccessor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode leveOrderSuccessor(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
                int levelSize = queue.size();
                TreeNode currentNode = queue.remove();
                if (currentNode.left != null) queue.add(currentNode.left);
                if (currentNode.right!= null) queue.add(currentNode.right);

                if(currentNode.val == target) break;
            }
        return queue.peek();
    }
}
