import org.w3c.dom.Node;

public class SearchInLL {
    public static void main(String[] args) {

    }

    public static boolean search(int n, Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                return true;
            } else {
                curr = curr.next;
            }
        }
        return false;
    }
}
