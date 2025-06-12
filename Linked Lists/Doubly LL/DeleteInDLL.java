public class DeleteInDLL {
    Node deleteInDLL(Node head){

        if(head == null) return null;

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.back.next = null;
        return head;
    }
}

class Node {
    public int data;       // Data stored in the node
    public Node next;      // Reference to the next node in the list (forward direction)
    public Node back;      // Reference to the previous node in the list (backward direction)

    // Constructor for a Node with both data, a reference to the next node, and a reference to the previous node
    public Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    // Constructor for a Node with data, and no references to the next and previous nodes (end of the list)
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}