import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostOneStack{
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

    public List<Integer> iterativePreorder(TreeNode root){

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
    
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                // Go to leftmost node
                stack.push(curr);
                curr = curr.left;
            } else {
                // Peek at the top node
                TreeNode peekNode = stack.peek();
                
                // If right child exists and hasn't been processed yet
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    // Process the node (postorder)
                    result.add(peekNode.val);
                    lastVisited = stack.pop();
                }
            }
        }
        
        return result;
    }
}