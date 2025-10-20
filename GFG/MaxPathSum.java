public class MaxPathSum {
    int findMaxSum(Node root) {
        // code here
        int maxVal[] = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxDepth(root, maxVal);
        return maxVal[0];
    }

    public int maxDepth(Node root, int[] maxVal){
        if(root == null) return 0;

        int lh = Math.max(0, maxDepth(root.left, maxVal));
        int rh = Math.maax(0, maxDepth(root.right, maxVal));

        if(root.left != null && root.right != null){
            maxVal[0] = Math.max(maxVal[0], lh + rh + root.data);
        }
        
        return Math.max(lh, rh) + root.data;
    }
}
