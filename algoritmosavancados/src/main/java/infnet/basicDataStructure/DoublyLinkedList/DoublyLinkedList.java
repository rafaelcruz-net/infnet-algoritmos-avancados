package infnet.basicDataStructure.DoublyLinkedList;

public class DoublyLinkedList<V> {
    private Node<V> head;
    private Node<V> tail;

    public void insertFirst(V data) {
        Node<V> newNode = new Node<V>(data);

        newNode.setNext(head);
        newNode.setPrevious(null);

        if (head != null) {
            head.setPrevious(newNode);
        }

        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
    }

    public void insertLast(V data) {
        Node<V> newNode = new Node<V>(data);

        newNode.setNext(null);
        newNode.setPrevious(tail);

        if (tail != null)
            tail.setNext(newNode);

        tail = newNode;

        if (head == null)
            head = newNode;
    }

    public void deleteFirst() {
        if (isEmpty())
            throw new RuntimeException("Doubly linked list is already empty");

        head = head.getNext();
        head.setPrevious(null);
    }

    public void deleteLast() {
        if (isEmpty())
            throw new RuntimeException("Doubly linked list is already empty");

        tail.setPrevious(tail.getPrevious());
        tail.setNext(null);
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void printLinkedListForward() {
        System.out.println("Printing Doubly LinkedList (head --> tail) ");
        Node<V> current = head;
        while (current != null) {
            System.out.println(current.toString());
            current = current.getNext();
        }
        System.out.println();
    }

    public void printLinkedListBackward() {
        System.out.println("Printing Doubly LinkedList (tail --> head) ");
        Node<V> current = tail;
        while (current != null) {
            System.out.println(current.toString());
            current = current.getPrevious();
        }
        System.out.println();
    }

}
