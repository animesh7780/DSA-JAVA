public class AddLL {
    public Node addTwoLists(Node head1, Node head2) {
        // Helper: reverse list
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;
        
        // Your existing addition logic (now correct after reverse)
        while(head1 != null || head2 != null || carry != 0){
            int x = (head1 != null) ? head1.data : 0;
            int y = (head2 != null) ? head2.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;
        }
        
        // Reverse back to forward order
        Node result = reverse(dummy.next);
        
        // Remove leading zeros (GFG requirement)
        while(result != null && result.data == 0) {
            result = result.next;
        }
        return result == null ? new Node(0) : result;
    }

    Node reverse(Node head) {
        Node prev = null, curr = head;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
