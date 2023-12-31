package Trees.BinaryTrees.Questions;

import java.util.*;

public class _07_Symmetric_Tree {
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.right = right;
          this.val = val;
          this.left = left;
      }
  }

    public boolean isSymmetric(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root.left);
       queue.add(root.right);

       while(!queue.isEmpty()){
           TreeNode left = queue.remove();
           TreeNode right = queue.remove();
           if(left == null && right == null){
               continue;
           }
           if(left == null || right == null){
               return false;
           }
           if(left.val != right.val){
               return false;
           }

           queue.add(left.left);
           queue.add(right.right);
           queue.add(left.right);
           queue.add(right.left);
       }
       return true;
    }
}
