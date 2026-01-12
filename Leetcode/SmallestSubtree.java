public class SmallestSubtree {

    private static class Pair {
        TreeNode node;
        int depth;

        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    public Pair dfs(TreeNode root){
        if(root == null) return new Pair(null, 0);

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        if(left.depth == right.depth) return new Pair(root, right.depth + 1);
        else if(left.depth > right.depth) return new Pair(left.node, left.depth + 1);
        else return new Pair(right.node, right.depth + 1);
    }
}
