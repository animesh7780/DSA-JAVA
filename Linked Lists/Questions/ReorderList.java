import java.util.Stack;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        
        // Step 1: Find the middle of the list
        ListNode mid = findMid(head);
        ListNode l2 = reverse(mid.next);
        mid.next = null; // Split the list into two halves

        // Step 2: Merge the two halves
        ListNode l1 = head;
        while (l2 != null) {
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;

            l1.next = l2;
            l2.next = next1;

            l1 = next1;
            l2 = next2;
        }
    }

    // Helper method to find the middle of the list
    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper method to reverse a linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reorderList1(ListNode head){
        if (head == null || head.next == null) return;
        Stack<ListNode> st = new Stack<>();

        ListNode mid = findMid(head);
        ListNode curr = mid.next;
        mid.next = null; // Split the list at mid

        // Push all nodes after mid onto the stack
        while (curr != null) {
            st.push(curr);
            curr = curr.next;
        }

        curr = head;
        while (!st.isEmpty()) {
            ListNode next = curr.next;
            ListNode top = st.pop();
            curr.next = top;
            top.next = next;
            curr = next;
            if (curr == null) break;
        }
        // If there are extra nodes, ensure the last node points to null
        if (curr != null) curr.next = null;
    }
}
