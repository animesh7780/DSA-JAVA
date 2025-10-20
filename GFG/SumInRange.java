import java.util.ArrayList;

public class SumInRange {
    public int nodeSum(Node root, int l, int r) {
        // code here
        if(root == null) return 0;
        if(root.val < l) return nodeSum(root.right, l, r);
        if(root.val > r) return nodeSum(root.left, l, r);
        return root.val + nodeSum(root.left, l, r) + nodeSum(root.right, l, r);
    }

}
