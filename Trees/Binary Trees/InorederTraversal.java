import java.util.ArrayList;
import java.util.List;

public class InorederTraversal {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if(root == null) return ans;

        ans.addAll(inorderTraversal(root.left));
        ans.add(root.val);
        ans.addAll(inorderTraversal(root.right));

        return ans;
    }
}
