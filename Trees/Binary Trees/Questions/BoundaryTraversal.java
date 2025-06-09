import java.util.ArrayList;
import java.util.Collections;

public class BoundaryTraversal {

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

    public boolean isLeaf(TreeNode node){
        if( node == null){
            return false;
        }

        if(node.right == null && node.left == null){
            return true;
        }

        return false;
    }

    void addLeftBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode curr = root.left;
        while(curr != null){
            if(isLeaf(curr) == false) res.add(curr.val);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    void addRightBoundary(TreeNode root, ArrayList<Integer> res){
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();  // Use temp list
        
        while(curr != null){
            if(!isLeaf(curr)) {
                temp.add(curr.val);  // Add to temp first
            }
            if(curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;     // Fall back to left child
            }
        }
        
        // Reverse and add to result (right boundary is bottom-up)
        Collections.reverse(temp);
        res.addAll(temp);
    }

    void addLeafNodes(TreeNode root, ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.val);
            return;
        }

        if(root.left != null) addLeafNodes(root.left, res);
        if(root.right != null) addLeafNodes(root.right, res);
    }

    ArrayList<Integer> printBoundary(TreeNode node){
        ArrayList<Integer> list = new ArrayList<>();

        if(isLeaf(node) == false) list.add(node.val);
        addLeftBoundary(node, list);
        addLeafNodes(node, list);
        addRightBoundary(node, list);

        return list;
    }

}
