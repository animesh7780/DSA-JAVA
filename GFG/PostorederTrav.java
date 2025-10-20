import java.util.ArrayList;

public class PostorederTrav {
        public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return null;

        ans.addAll(postOrder(root.right));
        ans.addAll(postOrder(root.left));
        ans.add(root.val);

        return ans;
    }
}
