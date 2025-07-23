public class FlateeningLL{
    public ListNode flattenLinkedList(ListNode head) {
        if (head == null) return head;
        
        // Find the last node
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        
        // Go through all nodes and append children to end
        ListNode change = head;
        while (change != null) {
            if (change.child != null) {
                curr.next = change.child;
                change.child = null;  // Clean up child pointer
                
                // Update curr to new last node
                while (curr.next != null) {
                    curr = curr.next;
                }
            }
            change = change.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}