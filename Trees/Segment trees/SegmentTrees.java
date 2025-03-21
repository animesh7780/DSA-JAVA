public class SegmentTrees {
    private class Node {
        int data;
        Node left;
        Node right;
        int start;
        int end;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    Node root;

    public SegmentTrees(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node node = new Node(start, end);
            node.data = arr[start];
            return node;
        }
        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null)
            return;

        String str = "";
        if (node.left != null) {
            str += "Left: [" + node.left.start + "-" + node.left.end + "]=" + node.left.data + " ";
        } else {
            str += "Left: NULL ";
        }

        str += "Current: [" + node.start + "-" + node.end + "]=" + node.data + " ";

        if (node.right != null) {
            str += "Right: [" + node.right.start + "-" + node.right.end + "]=" + node.right.data;
        } else {
            str += "Right: NULL";
        }

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public int query(int start, int end) {
        return query(this.root, start, end);
    }

    private int query(Node node, int start, int end) {
        if (node.start >= start && node.end <= end) {
            return node.data;
        }

        if (end < node.start || start > node.end) {
            return 0;
        }

        return query(node.left, start, end) + query(node.right, start, end);
    }

    public void update(int index, int value) {
        update(this.root, index, value);
    }

    private void update(Node node, int index, int value) {
        if (node.start == node.end) {
            node.data = value;
            return;
        }

        int mid = (node.start + node.end) / 2;
        if (index <= mid) {
            update(node.left, index, value);
        } else {
            update(node.right, index, value);
        }

        node.data = node.left.data + node.right.data;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        SegmentTrees st = new SegmentTrees(arr);

        st.display();

        System.out.println("Query(1, 3): " + st.query(1, 3));
        st.update(2, 10);
        System.out.println("After Update:");
        st.display();
    }
}
