package infnet.basicDataStructure.CorrecaoLista.Lista4;
public class DoublyLinkedList<V> {
    private Node<V> head;
    private Node<V> tail;
    private int size = 0;

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
        size++;
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

        size++;
    }

    public void append(V data) {
        Node<V> newNode = new Node<V>(data);
        newNode.setNext(null);

        
        //Se a lista estiver vazia, será o novo head
        if (head == null) {
            newNode.setPrevious(head);
            head = newNode;
            return;
        }

        Node<V> tempNode = this.head;

        /* vamos varrer a lista até o final */
        while (tempNode.getNext() != null)
            tempNode = tempNode.getNext();

        tempNode.setNext(newNode);
        newNode.setPrevious(tempNode);

        size++;
    }

    public Node<V> findNode(Object value) {
        if (isEmpty())
            throw new RuntimeException("Doubly linked list is already empty");

        Node<V> current = head;
        Node<V> foundedNode = null;
        int eofList = 0;
        while (current != null && eofList < size) {
            if (current.getValue() == value) {
                foundedNode = current;
                return foundedNode;
            }

            current = current.getNext();
            eofList++;
        }

        return foundedNode;

    }

    public void deleteFirst() {
        if (isEmpty())
            throw new RuntimeException("Doubly linked list is already empty");

        head = head.getNext();
        head.setPrevious(null);
        size--;
    }

    public void delete(Object value) {
        if (isEmpty())
            throw new RuntimeException("Doubly linked list is already empty");

        Node<V> node = this.findNode(value);

        if (node == null)
            throw new RuntimeException("Node not found");

        Node<V> previous = node.getPrevious();

        previous.setNext(node.getNext());
        node.getNext().setPrevious(previous);

        node.setNext(null);
        node.setPrevious(null);

        size--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new RuntimeException("Doubly linked list is already empty");

        tail.setPrevious(tail.getPrevious());
        tail.setNext(null);
        size--;
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

    public int getSize() {
        return size;
    }
}
