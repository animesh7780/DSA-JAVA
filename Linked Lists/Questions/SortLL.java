public class SortLL{
    // public ListNode sortListViaArray(ListNode head) {
    //     if (head == null) return null;
        
    //     // Convert to list
    //     List<Integer> values = new ArrayList<>();
    //     ListNode current = head;
    //     while (current != null) {
    //         values.add(current.val);
    //         current = current.next;
    //     }
        
    //     // Sort the list
    //     Collections.sort(values);
        
    //     // Rebuild linked list
    //     ListNode newHead = new ListNode(values.get(0));
    //     current = newHead;
    //     for (int i = 1; i < values.size(); i++) {
    //         current.next = new ListNode(values.get(i));
    //         current = current.next;
    //     }
        
    //     return newHead;
    // }

    ListNode sortLinList(ListNode head){
        if(head == null || head.next == null) return head;

        // splitting the list to preform merge sort
        ListNode mid = midOfLL(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        //recursively sorting them 

        left = sortLinList(left);
        right = sortLinList(right);

        //merge the sorted list

        return mergeLL(left, right);

    }

    ListNode midOfLL(ListNode head){
        if (head == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return prev;
    }

    ListNode mergeLL(ListNode right, ListNode left){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        
        // Attach remaining nodes
        current.next = (left != null) ? left : right;
        
        return dummy.next;
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
