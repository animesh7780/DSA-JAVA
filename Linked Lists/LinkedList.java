import org.w3c.dom.Node;

public class LinkedList {

    private class LL {

        private Node head;
        private Node tail;
        private int size;

        public LL() {
            this.size = 0;
        }

        // insert using recursion
        public void insertUsingRecursion(int value, int index) {
            head = insertRec(value, index, head);
        }

        private Node insertRec(int val, int index, Node node) {
            if (index == 0) {
                Node temp = new Node(val, node);
                size++;
                return temp;
            }
            node.next = insertRec(val, index--, node.next);
            return node;
        }

        public void inserrtFirst(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;

            if (tail == null) {
                tail = head;
            }

            size++;
        }

        public void insertLast(int value) {
            if (tail == null) {
                tail = new Node(value);
                head = tail;
            } else {
                tail.next = new Node(value);
                tail = tail.next;
            }
        }

        public void insertAtIndex(int value, int index) {
            if (index == 0) {
                inserrtFirst(value);
            } else if (index == size) {
                insertLast(value);
            }
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next = node;
            size++;
        }

        public int deleteFirst() {
            int value = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return value;
        }

        public int deleteLast() {
            if (size <= 1) {
                return deleteFirst();
            }
            Node secondLast = get(size - 1);
            int value = tail.value;
            tail = secondLast;
            tail.next = null;
            size--;
            return value;
        }

        public int deleteAtIndex(int index) {
            if (index == 0) {
                return deleteFirst();
            } else if (index == size - 1) {
                return deleteLast();
            }
            Node temp = get(index - 1);
            int value = temp.next.value;
            temp.next = temp.next.next;
            size--;
            return value;
        }

        public Node findValue(int value) {
            Node node = head;
            while (node != null) {
                if (node.value == value) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        // get index
        public Node get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + "->" + " ");
                temp = temp.next;
            }
            System.out.println("END");
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

        // questions from leetcode
        // Leet 83
        public void deleteDuplicates() {
            Node node = head;
            while (node.next != null) {
                if (node.value == node.next.value) {
                    node.next = node.next.next;
                    size--;
                } else {
                    node = node.next;
                }
            }
            tail = node;
            tail.next = null;
        }
    }

    // merge two lists
    // 21 leetcode

    public static LL merge(LL list1, LL list2) {
        Node f = list1.head;
        Node s = list2.head;
        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    // 141 leetcode
    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // length of cycle
    public int lengthCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                Node temp = slow;
                int count = 0;
                do {
                    temp = temp.next;
                    count++;
                } while (temp != slow);
                return count;
            }
        }
        return 0;
    }

    // leetcode 143 cycle II

    public listNode detectCycle(listNode head) {
        listNode slow = head;
        listNode fast = head;

        int lenght = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start of the cycle
        listNode f = head;
        listNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // Happy number leetcode 202

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        if (slow == 1) {
            return true;
        }
        return false;

    }

    // Leetcode 876
    // Middle of linked list

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private int findSquare(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }

    // reverse linked list

    private void bubbleSort() {
        bubbleSort(-1, 0);
    }

    public void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    public static void main(String[] args) {

        LL list1 = new LL();
        LL list2 = new LL();

        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(5);
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.insertLast(5);
        LL ans = merge(list1, list2);
        ans.display();
    }
}