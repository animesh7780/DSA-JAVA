import org.w3c.dom.Node;

public class InsertAtEndInLL {
    public static void main(String[] args) {

    }

    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next == null) {
                curr.next = temp;
            }
            curr = curr.next;
        }
        return head;
    }
}
