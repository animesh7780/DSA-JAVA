public class NodesBetwZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int sum = 0;

        while(curr != null){
            if(curr.val != 0){
                sum += curr.val;
            }
            else{
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
