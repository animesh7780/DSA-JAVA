import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class Kclosest {

    public ArrayList<Integer> getKClosest(Node root, int target, int k) {
        LinkedList<Integer> dq = new LinkedList<>();
        inorder(root, target, k, dq);
        return new ArrayList<>(dq);
    }

    private void inorder(Node root, int target, int k, LinkedList<Integer> dq) {
        if (root == null) return;

        inorder(root.left, target, k, dq);

        // If deque has fewer than k elements, add current node
        if (dq.size() < k) {
            dq.addLast(root.data);
        }
        // If current node is closer than the farthest in deque
        else {
            int diffOldest = Math.abs(dq.peekFirst() - target);
            int diffNew = Math.abs(root.data - target);

            if (diffNew < diffOldest) {
                dq.removeFirst();
                dq.addLast(root.data);
            } 
            else {
                // Stop early: further nodes will be even farther in inorder traversal
                return;
            }
        }

        inorder(root.right, target, k, dq);
    }
}
