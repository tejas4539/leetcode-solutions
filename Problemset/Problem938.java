import javax.swing.tree.TreeNode;

public class Problem938 {
     public int rangeSumBST(TreeNode root, int low, int high) {
        if(root== null) return 0;
        int count=0;
        if(root.val<=high && root.val>=low){
            count=count+root.val;
        }
        count+=rangeSumBST(root.left,low,high);
        count+=rangeSumBST(root.right,low,high);
        return count;

    }
}
