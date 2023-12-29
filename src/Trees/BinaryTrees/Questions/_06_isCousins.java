package Trees.BinaryTrees.Questions;

public class _06_isCousins {
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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);

        return (level(root,xx,0)==level(root,yy,0) && !isSiblings(root,xx,yy));
    }
    public TreeNode findNode(TreeNode root, TreeNode node){
        if(root == null){
            return null;
        }
        if(root == node){
            return root;
        }

        TreeNode ans = findNode(root.left, node);
        if(ans!=null) return ans;

        return findNode(root.right, node);
    }
    public int level(TreeNode root, TreeNode node, int level){
        if(root == null) return 0;
        if(root == node) return level;

        int l = level(root.left, node, level+1);
        if(l!=0) return l;

        return level(root.right, node, level+1);
    }

    public boolean isSiblings(TreeNode root, TreeNode xx, TreeNode yy){
        if(root == null) return false;

        return ((root.left == xx && root.right == yy) || (root.right == xx && root.left == yy)
                || isSiblings(root.left,xx,yy) || isSiblings(root.right, xx, yy));
    }
}
