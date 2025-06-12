import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
 
    public int findKthSmallest(TreeNode root, int k) {
        int[] count = new int[1];
        int[] result = new int[1];
        inorderTraversalOptimized(root, k, count, result);
        return result[0];
    }

    private void inorderTraversalOptimized(TreeNode root, int k, int[] count, int[] result) {
        if (root == null || count[0] >= k) return;
        
        inorderTraversalOptimized(root.left, k, count, result);
        
        count[0]++;
        if (count[0] == k) {
            result[0] = root.val;
            return;
        }
        
        inorderTraversalOptimized(root.right, k, count, result);
    }

    public int findKthSmallest1(TreeNode root, int k) {
        List<Integer> inorderList = inorderTraversal(root);
        return inorderList.get(k - 1); // k-1 because list is 0-indexed
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        ans.addAll(inorderTraversal(root.left));
        ans.add(root.val);
        ans.addAll(inorderTraversal(root.right));
        return ans;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
    TreeNode(int val) {
        this.val = val;
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}