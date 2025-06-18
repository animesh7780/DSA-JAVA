public class RemoveNode {
    ListNode findandDelete(ListNode head, int N){
        ListNode fast = head;
        ListNode slow = head;

        for(int i=0; i<N; i++){
            fast = fast.next;
        }

        if(fast != null) return head.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode deleNode = slow.next;
        slow.next = slow.next.next;
        deleNode = null;
        
        return head;
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
