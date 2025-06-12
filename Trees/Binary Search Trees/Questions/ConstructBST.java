public class ConstructBST {
  TreeNode bstFromPreorder(int[] A){
    return bstfromPreorder(A, Integer.MAX_VALUE, new int[]{0});
  } 

  TreeNode bstfromPreorder(int[] A, int bound, int[] i){
    if(i[0] == A.length || A[i[0]] > bound) return null;
    TreeNode root = new TreeNode(A[i[0]++]);
    root.left =  bstfromPreorder(A, root.val, i);
    root.right =  bstfromPreorder(A, bound, i);

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
