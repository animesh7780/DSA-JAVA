public class CellInTree{
    int findCellingOfTree(TreeNode root, int key){
        int ceil = -1;
        while(root != null){
            if(root.val == key){
                ceil = root.val;
                return ceil;
            }
            else if(key > root.val){
                root = root.right;
            }else{
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
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