import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class LLtoBST {
    // public TreeNode sortedListToBST(ListNode head) {
    //     if(head == null) return null;

    //     TreeNode root = 

    // }

    // public ListNode findMid(ListNode head){
    //     ListNode slow = head;
    //     ListNode fast = head;

    //     while(slow.next != null && fast.next.next != null){
    //         slow = slow.next;
    //         fast = fast.next;
    //     }

    //     return slow;
    // }

    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> tree = new ArrayList<>();

        ListNode curr = head;
        while(curr != null){
            tree.add(curr.val);
            curr = curr.next;
        }   
        return buildBST(tree, 0, tree.size()-1);
    }

    private TreeNode buildBST(ArrayList<Integer> ans, int left, int right){
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(ans.get(mid));
        node.left = buildBST(ans, left, mid-1);
        node.right = buildBST(ans, mid+1, right);
        return node;
    }
}
