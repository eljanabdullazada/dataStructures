package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Question94 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
    }

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void inorder(TreeNode node, List<Integer> result){
        if(node == null) return;

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);

    }
}
