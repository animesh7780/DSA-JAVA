import java.util.ArrayList;
import java.util.List;

public class MaxTwinSum {
    public int pairSum(ListNode head) {
        // Initialize a list to store node values
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        
        int maxSum = 0;
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            int sum = list.get(i) + list.get(n - 1 - i);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
