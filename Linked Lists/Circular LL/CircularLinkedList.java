import org.w3c.dom.Node;

public class CircularLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void deleteSome(int value) {
        Node node = head;
        if (node == null) {
            System.out.println("List is empty");
            return;
        }
        if (node.value == value) {
            head = node.next;
            tail.next = head;
            size--;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.value + "->" + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("HEAD");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);
        list.deleteSome(5);
        list.display();
    }
}
