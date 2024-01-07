package Trees.BinaryTrees.Questions;
import java.util.ArrayList;

public class _16_Sum_to_root_leaf_Numbers {
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
        private ArrayList<Integer> list = new ArrayList<>();
        public int sumNumbers(TreeNode root) {
            if(root == null) return -1;
            helper(root, root.val);
            int sum = 0;
            for(int i=0; i<list.size(); i++){
                sum += list.get(i);
            }
            return sum;
        }
        public void helper(TreeNode root, int sum){
            if(root==null) return;

            if(root.left==null&&root.right==null){
                list.add(sum);
                return;
            }

            if(root.left!=null) helper(root.left,sum*10+root.left.val);
            if(root.right!=null) helper(root.right,sum*10+root.right.val);
        }
    }

