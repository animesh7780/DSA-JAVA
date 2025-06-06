public class BalancedBinaryTree {
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

    public boolean balancedTree(TreeNode root){
        return maxDepth(root) != -1;
    }

    public int maxDepth(TreeNode root){
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        if(lh == -1) return -1;
        int rh = maxDepth(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh-rh)>1) return -1;
        return 1 + Math.max(lh, rh);
    }
}
