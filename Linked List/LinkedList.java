public class LinkedList {

    private int size;
    private Node node;

    public LinkedList() {
        size = 0;
    }

    public void print() {
        System.out.print("[");
        Node current = node;
        for (int i = 0; i <= size && current != null; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(current.getVal());
            current = current.getNext();
        }
        System.out.println("]");
    }

    public void add(String newVal) {

        if (size == 0) {
            Node node = new Node(newVal);
            this.node = node;
            size++;
            return;
        }

        Node lastNodeOnList = this.node;
        for (int i = 0; i < size - 1; i++) {
                lastNodeOnList = lastNodeOnList.getNext();
            }
            Node node = new Node(newVal);
            lastNodeOnList.setNext(node);
            size++;
        }

    class Node {
        private String val;
        private Node next;

        public Node(String val) {
            this.val = val;
        }

        public Node(String val, Node next) {
            this.val = val;
            this.next = next;
        }

        public String getVal() {
            return val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
