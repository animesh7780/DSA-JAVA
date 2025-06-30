import java.util.ArrayList;
import java.util.Collections;

public class Sort0sand1s {

    // public ListNode sortLL(ListNode head){
    //     if(head == null) return null;

    //     //convert to list
    //     ArrayList<Integer> list = new ArrayList<>();
    //     ListNode current  = head;
    //     while(current != null){
    //         list.add(current.val);
    //         current = current.next;
    //     }

    //     Collections.sort(list);

    //     ListNode newHead = new ListNode(list.get(0));
    //     current = newHead;
    //     for(int i=1; i<list.size(); i++){
    //         current.next = new ListNode(list.get(i));
    //         current = current.next;
    //     }

    //     return newHead;
    // }

    public ListNode sortLL(ListNode head){
        if(head == null) return null;

        ListNode mid = getMid(head);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null; //break the link between the right and left
        
        //breaking them to sort them out
        left = sortLL(left);
        right = sortLL(right);

        return mergeLL(left, right);
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode mergeLL(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        //sorting them out
        while(left != null && right != null){
            if(left.val < right.val){
                curr.next = left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        curr.next = (left != null) ? left : right;

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