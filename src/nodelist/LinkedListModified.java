package nodelist;

public class LinkedListModified {

    private NodeModified head;

    public LinkedListModified() {
        this.head = null;
    }

    public void push(NodeModified node) {
        if (head == null) {
            head = node;
        } else {
            NodeModified current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public NodeModified pop() {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            NodeModified temp = head;
            head = null;
            return temp;
        }

        NodeModified current = head;
        NodeModified prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
        return current;
    }

    public void insert(int index, NodeModified node) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }

        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        NodeModified current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        node.next = current.next;
        current.next = node;
    }

    public void remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }

        if (index == 0) {
            if (head != null) {
                head = head.next;
            }
            return;
        }

        NodeModified current = head;
        NodeModified prev = null;
        for (int i = 0; i < index && current != null; i++) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        prev.next = current.next;
    }

    public NodeModified elementAt(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }

        NodeModified current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return current;
    }

    public int size() {
        int count = 0;
        NodeModified current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printList() {
        NodeModified current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
