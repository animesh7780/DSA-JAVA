import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);

        int left = 0;
        int right = nums.size()-1;

        while(left < right){
            int sum = nums.get(left) + nums.get(right);
            if(sum == k) return true;
            if(sum <= k) left++;
            else right--;
        }
        return false;
    }
    
    public void inorder(TreeNode root, List<Integer> nums){
        if(root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
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
