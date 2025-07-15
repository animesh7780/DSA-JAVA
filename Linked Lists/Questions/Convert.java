public class Convert{
    public int getDecimalValue(ListNode head) {
        String n = "";
        if(head == null){
            return 0;
        }
        ListNode curr = head;
        while(curr != null){
            n += curr.val;
            curr = curr.next;
        }
        return Integer.parseInt(n,2);
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