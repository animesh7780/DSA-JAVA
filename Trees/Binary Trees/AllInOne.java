import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllInOne {
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

    // Pair class to track node and its state
    public class Pair {
        TreeNode node;
        int num;  // 1 = preorder, 2 = inorder, 3 = postorder
        
        public Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
    }

    public void allinOne(TreeNode root){
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root, 1)); 

        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        List<Integer> in = new ArrayList<>();

        if(root == null) return;

        while(!st.isEmpty()){
            Pair it = st.pop();

            //this is pre part
            //increment 1 to 2
            //push the left side into the tree

            if(it.num == 1){
                pre.add(it.node.left.val);
                it.num++;
                st.push(it);

                if(it.node.left == null){
                    st.push(new Pair(it.node.left, 1));
                }
            }

            //this is inorder part
            //increment 2 to 3
            //push right

            else if(it.num == 2){
                in.add(it.node.right.val);
                it.num++;
                st.push(it);

                if(it.node.right == null){
                    st.push(new Pair(it.node.right, 1));
                }
            }

            else{
                post.add(it.node.val);
            }
        }
    }

}
