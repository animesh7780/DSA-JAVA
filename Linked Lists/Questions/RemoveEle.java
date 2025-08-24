public class RemoveEle {
    public ListNode removeElements(ListNode head, int val) {
        //handling the case where all are same
        while(head != null  && head.val == val){
            head = head.next;
        }

        //handling other cases
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}
