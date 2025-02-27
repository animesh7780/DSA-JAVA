public class Leet2095 {
    public static void main(String[] args) {

    }

    public ListNode deleteMiddle(ListNode head) {
        ListNode middle = middleNode(head);
        middle.value = middle.next.value;
        return head;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
