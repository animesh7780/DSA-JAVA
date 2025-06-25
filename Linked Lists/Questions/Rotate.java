public class Rotate {
    ListNode rotateLL(ListNode head, int k){
        // Handle edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int len=1;
        ListNode curr = head;
        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        
        // Optimize k (handle cases where k > len)
        k = k % len;
        if (k == 0) {
            return head; // No rotation needed
        }
        
        curr.next = head;
        
        ListNode temp = head;
        int cnt = 0;
        while(cnt < len - k - 1){
            cnt++;
            temp = temp.next;
        }
        
        ListNode newHead = temp.next;
        temp.next = null;
        
        return newHead;
    }
}

class ListNode {
    public int val;       // val stored in the ListNode
    public ListNode next;      // Reference to the next ListNode in the list (forward direction)
    public ListNode back;      // Reference to the previous ListNode in the list (backward direction)

    // Constructor for a ListNode with both val, a reference to the next ListNode, and a reference to the previous ListNode
    public ListNode(int val, ListNode next, ListNode back) {
        this.val = val;
        this.next = next;
        this.back = back;
    }

    // Constructor for a ListNode with val, and no references to the next and previous ListNodes (end of the list)
    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.back = null;
    }
}