package Trees.BinaryTrees.Questions;

public class _14_Serialize_and_Deserialize_BT {


        public static void main(String[] args) {
//            TreeNode root = new TreeNode(1);
//            root.left = new TreeNode(2);
//            root.right = new TreeNode(3);
//            root.right.right = new TreeNode(5);
//            root.right.left = new TreeNode(4);
//
//            helper(root);
//            System.out.println(sb);
        }
        private StringBuilder sb = new StringBuilder();
//         Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return helper(root, "");
        }
        public String helper(TreeNode root,String str){
            if(root == null) return str;

            str = str+ helper(root.left,"")+","+root.val+","+helper(root.right,"");

            return str;
        }

        // Decodes your encoded data to tree.
//        public TreeNode deserialize(String data) {
//
//        }

}
