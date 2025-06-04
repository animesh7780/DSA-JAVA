import java.util.ArrayList;
import java.util.List;

public class PreorderTrav{

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

    // public void preorderTraversal(TreeNode node){
    //     if(node == null) return;

    //     System.out.println(node.val);
    //     preorderTraversal(node.left);
    //     preorderTraversal(node.right);
    // }

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans; // Return empty list
        
        ans.add(root.val); // Add the value
        
        // Recursively traverse left subtree
        ans.addAll(preorderTraversal(root.left));
        
        // Recursively traverse right subtree  
        ans.addAll(preorderTraversal(root.right));
        
        return ans; // Return the final list
    }

}