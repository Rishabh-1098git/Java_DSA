package Trees.BinaryTrees.Questions;

import java.util.ArrayList;

public class _12_Kth_Smallest_Element {
      public class TreeNode {
           int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
  }
    static ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;

        return list.get(k-1);
    }
    public void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }


}
