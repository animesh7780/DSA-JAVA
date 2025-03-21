public class Leet148 {

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

    public static void main(String[] args) {
        ListNode head = [4,2,1,3];
        Leet148 obj = new Leet148();
        obj.sortList(head);
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        while (head.next != null) {
            if (head.val > head.next.val) {
                int temp = head.val;
                head.val = head.next.val;
                head.next.val = temp;
            }
            head = head.next;
        }
        return head;
    }
}
