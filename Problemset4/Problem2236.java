package Problemset4;

import javax.swing.tree.TreeNode;

public class Problem2236 {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
