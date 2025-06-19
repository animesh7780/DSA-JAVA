public class Intersection {
    // int findIntersection(ListNode headA, ListNode headB){
    //     ListNode curr1 = headA;
        
    //     while(curr1 != null){  // Include last node
    //         ListNode curr2 = headB;  // Reset curr2 for each outer loop
    //         while(curr2 != null){    // Include last node
    //             if(curr1 == curr2){
    //                 return curr2.val;  // Return immediately when found
    //             }
    //             curr2 = curr2.next;
    //         }
    //         curr1 = curr1.next;
    //     }
    //     return 0;  // No intersection found
    // }

    //optimal Approach

    ListNode findIntersection(ListNode headA, ListNode headB){

        ListNode curr1 = headA;
        ListNode curr2 = headB;

        while(curr1 != curr2){
            curr1 = (curr1 == null) ? headB : curr1.next;
            curr2 = (curr2 == null) ? headA : curr2.next;
        }

        return (curr1 != null) ?curr1 : null;
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
