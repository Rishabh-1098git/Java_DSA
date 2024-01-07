package Trees.BinaryTrees.Questions;

public class _17_Max_Path_Sum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        int globalMax = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            helper(root);
            return globalMax;
        }

        public int helper(TreeNode root){
            if(root == null){
                return  0;
            }
            int left = helper(root.left);
            int right = helper(root.right);

            left = Math.max(0,left);
            right = Math.max(0,right);

            int pathSum = left+right+root.val;

            globalMax = Math.max(globalMax, pathSum);

            return Math.max(left,right)+root.val;
        }
    }

}
