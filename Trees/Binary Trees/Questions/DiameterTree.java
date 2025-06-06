public class DiameterTree {
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

    public int diameterOfTree(TreeNode root){
        int[] diameter = new int[1];
        maxDepth(root, diameter);
        return diameter[0];
    }

    public int maxDepth(TreeNode root, int[] diameter){
        if(root == null) return 0;

        int lh = maxDepth(root.left, diameter);
        int rh = maxDepth(root.right, diameter);

        diameter[0] = Math.max(diameter[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }
}
