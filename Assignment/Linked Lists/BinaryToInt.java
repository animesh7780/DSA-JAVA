public class BinaryToInt {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        String binary = "";
        while (head != null) {
            binary += head.val;
            head = head.next;
        }
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        BinaryToInt obj = new BinaryToInt();
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(0);
        head.next.next = obj.new ListNode(1);
        System.out.println(obj.getDecimalValue(head));
    }
}
