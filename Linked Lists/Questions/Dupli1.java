public class Dupli1 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode curr = head;
        
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return  head;
    }
}
