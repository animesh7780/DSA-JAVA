public class ReverseKth {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode kthNode;
        ListNode nextNode;
        ListNode prevNode = null; // Initialize prevNode
        
        while(temp != null){
            kthNode = findKth(temp, k);
            if(kthNode == null){
                if(prevNode != null) prevNode.next = temp; // Fixed syntax
                break;
            }
            nextNode = kthNode.next;
            kthNode.next = null;
            reverseLL(temp);
            if(temp == head) head = kthNode;
            else{
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }

    ListNode findKth(ListNode head, int k){
        int count = 0;
        while(head != null){
            count++;
            if(count == k) return head;
            head = head.next;
        }
        return null;
    }

    ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode current = head;
    
        while (current != null) {
            ListNode nextListNode = current.next;  // Store next ListNode
            current.next = prev;               // Reverse the link
            prev = current;                    // Move prev forward
            current = nextListNode;                // Move current forward
        }
    
        return prev;  // prev is now the new head
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
