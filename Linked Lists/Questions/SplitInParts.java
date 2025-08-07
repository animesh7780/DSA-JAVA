public class SplitInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int len = 0;

        while(curr.next != null){
            len++;
            curr = curr.next;
        }
        if(k > len){
            for()
        }
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}