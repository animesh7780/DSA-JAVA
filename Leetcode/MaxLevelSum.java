import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class MaxLevelSum {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        int ansLvl = 1;
        long sum = Long.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();
            long currSum = 0;

            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                currSum += node.val;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            if(currSum > sum){
                sum = currSum;
                ansLvl = level;
            }
            level++;
        }
        return ansLvl;
    }
}
