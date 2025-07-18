import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsWithSum {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (head == null) return result;
        
        ListNode left = head;
        ListNode right = head;
        
        // Find the last node
        while (right.next != null) {
            right = right.next;
        }
        
        // Two pointer approach
        while (left != right && left.val < right.val) {
            int sum = left.val + right.val;
            if (sum == target) {
                result.add(Arrays.asList(left.val, right.val));
                left = left.next;
                right = right.prev;
            } else if (sum > target) {
                right = right.prev;
            } else {
                left = left.next;
            }
        }
        
        return result;
    }      
}

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
