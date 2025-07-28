package LeetCode;

public class Question101 {
    public static void main(String[] args) {
        // Example symmetric tree:
        //     1
        //    / \
        //   2   2
        //  / \ / \
        // 3  4 4  3

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Question101 q = new Question101();
        boolean result = q.isSymmetric(root);
        System.out.println("Is symmetric? " + result);
    }


    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2){
        if((t1 == null) && (t2 == null)) return true;
        if((t1 == null) || (t2 == null)) return false;

        return (t1.val == t2.val) &&
                isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
    }
}
