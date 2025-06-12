import java.util.Stack;

public class BSTIterartor {

    private Stack<TreeNode> st = new Stack<TreeNode>();

    public BSTIterartor(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode tmpNode = st.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    void pushAll(TreeNode root){
        while(root != null){
            st.push(root);
            root = root.left;
        }
    }
}

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
