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

public class MaxInBST{
    int maxValueInBST(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE; // Handle empty tree
        
        // In a BST, the maximum value is always the rightmost node
        while (root.right != null) {
            root = root.right; // Move to right child
        }
        return root.val; // Return the rightmost node's value
    }
}

class MinInBST{
    int minValueInBST(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;

        while(root.left != null){
            root = root.left;
        }
        return root.val;
    }
}