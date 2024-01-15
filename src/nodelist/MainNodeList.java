package nodelist;

public class MainNodeList {

    public static void main(String[] args) {
        LinkedListModified list = new LinkedListModified();

        NodeModified node1 = new NodeModified(1);
        NodeModified node2 = new NodeModified(2);
        NodeModified node3 = new NodeModified(3);

        list.push(node1);
        list.push(node2);

        System.out.println("Original List:");
        list.printList();

        list.insert(0, node3);

        System.out.println("List after insertion:");
        list.printList();

        list.remove(1);

        System.out.println("List after removal:");
        list.printList();

        System.out.println("Size of the list: " + list.size());

        System.out.println("\nElemento da posição " + 1 + ": " + list.elementAt(1));
    }

}
