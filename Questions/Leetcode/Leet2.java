import java.lang.classfile.components.ClassPrinter.ListNode;

public class Leet2 {
    public static void main(String[] args) {
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Dummy node to simplify result list handling
        ListNode current = dummy; // Pointer to build the result list
        int carry = 0; // Carry for handling sums > 9

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0; // Get value from l1, or 0 if null
            int val2 = (l2 != null) ? l2.val : 0; // Get value from l2, or 0 if null
            
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Update carry for the next addition
            int newDigit = sum % 10; // Get the last digit of sum
            
            // Add new node with the computed digit
            current.next = new ListNode(newDigit);
            current = current.next; // Move pointer
            
            // Move to the next nodes in l1 and l2 if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // Return the result list (excluding the dummy node)
    }
}
