public class Add1Toll {
    ListNode add1(ListNode head){

        //reverse the LL
        head = reverse(head);

        //Add the 1 and handle the carry 
        ListNode curr = head;
        int carry = 1;

        while(curr != null && carry > 0){
            int sum = curr.val + carry;
            curr.val = sum % 10;

            if(carry > 0 && curr.next == null){
                curr.next = new ListNode(0);
            }

            curr = curr.next;
        }
        return head;
    }

    //handling the carry
    ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return reverse(head);
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
