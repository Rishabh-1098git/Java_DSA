package Trees.BinaryTrees.Questions;

import java.util.*;

public class _04_ZigZag_Traversal {
    private class TreeNode {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levellist = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.remove();
                levellist.add(currentNode.val);
                if(currentNode.left != null) queue.add(currentNode.left);
                if(currentNode.right != null) queue.add(currentNode.right);
            }
            if(level%2 != 0){
                levellist = reverse(levellist);
            }
            list.add(levellist);
            level++;
        }
        return list;
    }
    public List<Integer> reverse(List<Integer> levellist){
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < levellist.size(); i++) {
            newList.add(levellist.get(levellist.size()-1-i));
        }
        return newList;
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        if(root==null){
            return list;
        }
        Deque<TreeNode> queue = new LinkedList<>();

        queue.addFirst(root);

        int level = 0;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levellist = new ArrayList<>();
            for(int i=0; i<levelSize; i++){
                if(level%2 == 0) {
                    TreeNode currentNode = queue.removeFirst();
                    levellist.add(currentNode.val);
                    if (currentNode.left != null) queue.addLast(currentNode.left);
                    if (currentNode.right != null) queue.addLast(currentNode.right);
                }
                else{
                    TreeNode currentNode = queue.removeLast();
                    levellist.add(currentNode.val);
                    if (currentNode.right != null) queue.addFirst(currentNode.right);
                    if (currentNode.left != null) queue.addFirst(currentNode.left);
                }
            }
            list.add(levellist);
            level++;
        }
        return list;
    }

}
