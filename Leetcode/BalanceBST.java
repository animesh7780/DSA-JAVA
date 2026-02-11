import java.util.ArrayList;

public class BalanceBST {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inorderTrav(root, al);
        return constructTree(al, 0, al.size()-1);
    }

    private void inorderTrav(TreeNode root, ArrayList<Integer> al){
        if(root == null) return;

        inorderTrav(root.left, al);
        al.add(root.val);
        inorderTrav(root.right, al);
    }

    private TreeNode constructTree(ArrayList<Integer> al, int low, int high){
        if(low > high) return null;

        int mid = low + (high - low)/2;
        TreeNode root = new TreeNode(al.get(mid));

        root.left = constructTree(al, low, mid-1);
        root.right = constructTree(al, mid+1, high);

        return root;
    }
}
