public class LengthOfLoop {
    public Node detectCycle(Node head) {
        Node slow = head, fast = head;
        // First step: check if a loop exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Cycle detected, now find the start node
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast; // Starting node of loop
            }
        }
        return null; // No cycle
    }

    public int lengthOfLoop(Node head) {
        if (head == null || head.next == null) return 0;

        Node loopStart = detectCycle(head);
        if (loopStart == null) return 0;

        Node curr = loopStart;
        int count = 1; // start with 1 because loopStart itself is counted

        while (curr.next != loopStart) {
            count++;
            curr = curr.next;
        }
        return count;
    }

}
