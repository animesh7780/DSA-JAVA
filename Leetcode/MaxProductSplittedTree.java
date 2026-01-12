public class TreeNode{
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

public class MaxProductSplittedTree {
    private long total = 0;
    private long maxp = 0;
    private static final long MOD = 1000000007;

    public int maxProduct(TreeNode root) {
        total = sum(root);
        dfs(root);
        return (int) (maxp % MOD);
    }

    public long sum(TreeNode root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right); 
    }

    public long dfs(TreeNode root){
        if(root == null) return 0;
        long subtree = root.val + dfs(root.left) + dfs(root.right);
        if(subtree > total){
            maxp = Math.max(maxp, subtree + (total - subtree));
        }
        return subtree;
    }
}
