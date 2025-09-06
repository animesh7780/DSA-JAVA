class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class FindLoop {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast; // Loop starts here
            }
        }
        return null; // No cycle
    }

    public static void main(String[] args) {
        // Set up linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Create a loop: 5 -> 3
        n5.next = n3;

        ListNode entry = detectCycle(head);
        if (entry != null) {
            System.out.println("Loop starts at node with value: " + entry.val);
        } else {
            System.out.println("No loop detected.");
        }
    }
}
