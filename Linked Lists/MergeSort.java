import org.w3c.dom.Node;

//leetcode 148

public class MergeSort {

    public static LL merge(LL list1, LL list2) {
        Node f = list1.head;
        Node s = list2.head;
        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public static listNode getMid(listNode head) {
        listNode slow = head;
        listNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public listNode sortlist(listNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        listNode mid = getMid(head);
        listNode left = sortlist(head);
        listNode right = sortlist(mid);

        return merge(left, right);
    }

}
