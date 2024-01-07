package Trees.BinaryTrees.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class _18_PathExist_I {
    public static void main(String[] args) {
        int[] path  = {3,9,12,8};
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(16);
        root.right.right = new TreeNode(12);
        root.right.right.left = new TreeNode(8);

        System.out.println(pathExist(root, path));
    }
    public static boolean pathExist(TreeNode node, int[] path){
        return helper(node, path, 0);
    }

    private static boolean helper(TreeNode node, int[] path, int i){
        if(node == null) return false;

        if(i >= path.length || node.val != path[i]) return false;

        if(i == path.length-1 && node.left==null && node.right==null && node.val == path[i]){
            return true;
        }

        return helper(node.left, path, i+1) || helper(node.right, path, i+1);
    }
    int countPaths(TreeNode node , int sum){
        List<Integer> path = new LinkedList<>();

        return helper1(node, sum, path);
    }

    int helper1(TreeNode node, int sum, List<Integer> path){
        if(node == null) return 0;

        path.add(node.val);
        int s = 0;
        int count = 0;

        // how many paths can i make -->>
        ListIterator<Integer> itr = path.listIterator(path.size());
        while(itr.hasPrevious()){
            s+=itr.previous();

            if(s == sum){
                count++;
            }
        }




        count += helper1(node.left, sum, path)+helper1(node.right, sum, path);

        // BACKTRACK
        path.remove(path.size()-1);


        return count;
    }

}
