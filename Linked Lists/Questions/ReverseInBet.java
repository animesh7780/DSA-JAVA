import java.util.ArrayList;

public class ReverseInBet {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        if (head == null || head.next == null || left == right) {
            return head;
        }

        // Collect all values from the linked list
        ListNode curr = head;
        while (curr != null) {              // Include last node
            list.add(curr.val);
            curr = curr.next;
        }

        // Reverse the sublist using 0-based indices
        reverse(list, left - 1, right - 1);

        // Rebuild the linked list with new values in order
        ListNode dummy = new ListNode(0);
        curr = dummy;
        for (int val : list) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    public void reverse(ArrayList<Integer> list, int left, int right) {
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
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