public class FloorInTree {
    int findFloor(TreeNode root, int key){
        int floor = -1;
        while(root != null){
            if(root.val == key){
                floor = root.val;
                return floor;
            }
            else if(key > root.val){
                floor = root.val;
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return floor;
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
