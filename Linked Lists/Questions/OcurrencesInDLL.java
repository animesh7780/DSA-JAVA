public class OcurrencesInDLL {
    public ListNode deleteAllOccurrences(ListNode head, int k) {
        ListNode current = head;
        
        while (current != null) {
            if (current.val == k) {
                // Case 1: Node to delete is head
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                }
                // Case 2: Node to delete is tail (last node)
                else if (current.next == null) {
                    current.prev.next = null; 
                }
                // Case 3: Node to delete is in middle
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                
                // Move to next node before deletion
                ListNode nodeToDelete = current;
                current = current.next;
                // Optional: Clear references for garbage collection
                nodeToDelete.next = null;
                nodeToDelete.prev = null;
            } else {
                current = current.next;
            }
        }
        
        return head;  // Return the potentially new head
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