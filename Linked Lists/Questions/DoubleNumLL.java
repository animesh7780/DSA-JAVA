import java.math.BigInteger;

public class DoubleNumLL {

    public ListNode doubleIt(ListNode head) {
        if (head == null) return null;

        // Build number as string from linked list digits
        StringBuilder sb = new StringBuilder();
        ListNode curr = head;
        while (curr != null) {
            sb.append(curr.val);
            curr = curr.next;
        }

        // Convert to BigInteger and double it
        BigInteger num = new BigInteger(sb.toString());
        BigInteger doubled = num.multiply(BigInteger.valueOf(2));
        String doubledStr = doubled.toString();

        // Convert result string back to linked list
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        for (char c : doubledStr.toCharArray()) {
            node.next = new ListNode(c - '0');
            node = node.next;
        }

        return dummy.next;
    }

}
