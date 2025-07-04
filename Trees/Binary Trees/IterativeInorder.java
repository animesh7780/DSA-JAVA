import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {
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

    public List<Integer> inorderTrav(TreeNode root){

        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode node = root;
        while(true){
            if(node != null){
                st.push(node);
                node = node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                ans.add(node.val);
                node = node.right;
            }
        } 
        return ans;
    }
}
