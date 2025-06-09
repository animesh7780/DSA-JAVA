public class PathSum {

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

    public int maxPathSum(TreeNode root){
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxDepth(root, maxValue);
        return maxValue[0];
    }

    public int maxDepth(TreeNode node, int maxValue[]){
        if(node == null) return 0;

        int lh = Math.max(0, maxDepth(node.left, maxValue));
        int rh = Math.max(0, maxDepth(node.right, maxValue));

        maxValue[0] =  Math.max(maxValue[0], lh+rh);

        return Math.max(lh, rh) + node.val;
    }
}
