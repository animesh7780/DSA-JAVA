import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {
    
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

    public ArrayList<Integer> zigZagTrav(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean leftToRight = true;
        
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                
                // Add children to queue for next level
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            
            // If moving right to left, reverse the level
            if(!leftToRight){
                Collections.reverse(level);
            }
            
            // Add all elements from this level to result
            list.addAll(level);
            
            // Toggle direction for next level
            leftToRight = !leftToRight;
        }
        
        return list;
    }

}
