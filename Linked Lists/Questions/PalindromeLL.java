public class PalindromeLL{

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null) return true;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //found the middle above 
        // now getting to second half and reversing them 

        ListNode secondHalf = reverseList(slow.next);

        // declaring the first half to take it to the 
        // secondhalf and check for all the elements between them
        //i.e before middle and after it

        ListNode firstHAlf = head;

        while(secondHalf != null){
            if(firstHAlf.val != secondHalf.val) return false;

            firstHAlf = firstHAlf.next;
            secondHalf = secondHalf.next;
        }

        return true; 
    }

    public ListNode reverseList(ListNode head){
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