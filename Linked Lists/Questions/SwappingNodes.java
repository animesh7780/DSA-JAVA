import java.util.ArrayList;
import java.util.List;

public class SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {
        // Step 1: Store the values in ArrayList
        List<Integer> ans = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            ans.add(curr.val);
            curr = curr.next;
        }

        int n = ans.size();
        // Step 2: Swap k-th node from start and end (k-1 and n-k)
        int temp = ans.get(k - 1);
        ans.set(k - 1, ans.get(n - k));
        ans.set(n - k, temp);

        // Step 3: Rebuild the linked list
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for (int v : ans) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }

        return dummy.next;
    }

    //optimized approach
    public ListNode swappingNodes1(ListNode head, int k){
        ListNode first = head, second = head, curr = head;

        // Move to (k-1) steps to get the k-th node from start
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        ListNode kthFromStart = first;

        // Use two pointers to get k-th node from the end
        curr = first.next;
        while (curr != null) {
            second = second.next;
            curr = curr.next;
        }
        ListNode kthFromEnd = second;

        // Swap their values
        int tmp = kthFromStart.val;
        kthFromStart.val = kthFromEnd.val;
        kthFromEnd.val = tmp;

        return head;
    }
}



