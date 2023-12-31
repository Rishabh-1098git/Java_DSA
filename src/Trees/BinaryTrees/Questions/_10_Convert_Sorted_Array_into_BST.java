package Trees.BinaryTrees.Questions;

public class _10_Convert_Sorted_Array_into_BST {

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

    public TreeNode sortedArrayToBST(int[] nums) {
        return populate(nums,0,nums.length);
    }
    public TreeNode populate(int[] nums, int start, int end){
        if(start>=end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = insert(null,nums[mid]);

        root.left = populate(nums,start,mid);
        root.right = populate(nums,mid+1,end);

        return root;
    }
    public TreeNode insert(TreeNode node, int item){
        if(node == null){
            TreeNode newNode =new TreeNode(item);
            return newNode;
        }
        if(item < node.val) insert(node.left, item);
        if(item > node.val) insert(node.left, item);

        return node;
    }
}
