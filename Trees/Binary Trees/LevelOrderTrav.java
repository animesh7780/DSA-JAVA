import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTrav {

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

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrspList = new LinkedList<List<Integer>>();

        if(root == null) return wrspList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int lvlNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<lvlNum; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrspList.add(subList);
        }
        return wrspList;
    }

    
}
