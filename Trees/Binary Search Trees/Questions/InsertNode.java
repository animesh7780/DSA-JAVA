public class InsertNode {
    TreeNode insertValue(TreeNode root, int val){
        if(root == null) return new TreeNode(val);

        TreeNode curr = root;
        while(true){
            if(curr.val <= val){
                if(curr.right != null) curr = curr.right;
                else{
                    curr.right = new TreeNode(val);
                    break;
                }
            }else{
                if(curr.left != null) curr = curr.left;
                else{
                    curr.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
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
