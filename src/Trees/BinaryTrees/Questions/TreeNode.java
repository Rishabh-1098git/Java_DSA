package Trees.BinaryTrees.Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    private static StringBuilder sb1 = new StringBuilder();
    private static StringBuilder sb2 = new StringBuilder();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(4);

        String Inorder = root.helper1(root, "");
        System.out.println(Inorder);

        String[] inOrderArr = Inorder.split(",");
        System.out.println(Arrays.toString(inOrderArr));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < inOrderArr.length; i++) {
            list.add(inOrderArr[i]);
        }

        System.out.println(list);

    }
    public String serialize(TreeNode root) {
        return helper1(root, "");
    }

    public String helper1(TreeNode root, String str){
        if(root == null) return "null,";

        String strMid = root.val+",";
        String strLeft =  helper1(root.left,"");

        String strRight = helper1(root.right,"");

        return strMid+strLeft+strRight;

    }

    public TreeNode deserialize(String Inorder) {
        String[] inOrderArr = Inorder.split(",");

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < inOrderArr.length; i++) {
            list.add(inOrderArr[i]);
        }

        Collections.reverse(list);

        return helper2(list);
    }
    public TreeNode helper2(ArrayList<String> list){
        String val = list.remove(list.size()-1);

        if(val.charAt(0)=='n'){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2(list);
        node.right = helper2(list);

        return node;

    }
}
