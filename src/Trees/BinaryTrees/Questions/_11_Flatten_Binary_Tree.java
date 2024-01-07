package Trees.BinaryTrees.Questions;

public class _11_Flatten_Binary_Tree {
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
    public void flatten(TreeNode root) { 
        TreeNode currentNode = root;

        while(currentNode != null){
            TreeNode temp = currentNode.left;
            if(currentNode.left != null){
                while(temp.right!=null){
                    temp = temp.right;
                }
                temp.right = currentNode.right;
                currentNode.right = currentNode.left;
                currentNode.left = null;
            }
            currentNode = currentNode.right;
        }
    }
}
