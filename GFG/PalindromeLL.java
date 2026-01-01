public class PalindromeLL {
    public boolean isPalindrome(Node head) {
        // code here
        if(head == null || head.next == null) return true;

        Node fast = head, slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse secondHalf
        Node secondHalf = reverseLL(slow.next);
        
        Node firstHalf = head;
        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    
    Node reverseLL(Node head){
        Node prev = null, curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
