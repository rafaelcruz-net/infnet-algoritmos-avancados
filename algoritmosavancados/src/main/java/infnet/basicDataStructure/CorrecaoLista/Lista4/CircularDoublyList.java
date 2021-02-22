package infnet.basicDataStructure.CorrecaoLista.Lista4;

public class CircularDoublyList<V> {
    private Node<V> head;
    
    private int size = 0;

    public void insertFirst(V data) {
        Node<V> newNode = new Node<V>(data);

        if (head == null) {
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
            head = newNode;
            size++;
            return;
        }

        Node<V> last = head.getPrevious();
        newNode.setNext(head);
        head.setPrevious(newNode);

        newNode.setPrevious(last);
        last.setNext(newNode);


        size++;
    }

    public void insertLast(V data) {
        Node<V> newNode = new Node<V>(data);

        if (head == null) {
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
            head = newNode;
            size++;
            return;
        }

        Node<V> last = head.getPrevious();
        newNode.setNext(head);
        head.setPrevious(newNode);

        newNode.setPrevious(last);

        last.setNext(newNode);

        size++;
    }

    public Node<V> findNode(Object value) {
        if (isEmpty())
            throw new RuntimeException("Circular Doubly linked list is already empty");

        Node<V> current = head;
        Node<V> foundedNode = null;
        int eofList = 0;
        while (current != null && size > eofList) {
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
            throw new RuntimeException("Circular Doubly linked list is already empty");

        head = head.getNext();
        head.setPrevious(head.getPrevious());
        size--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new RuntimeException("Circular Doubly linked list is already empty");

        Node<V> node = head.getPrevious();
        head.setPrevious(node.getPrevious());
        node = null;
        
        size--;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void printLinkedListForward() {
        System.out.println("Printing Doubly LinkedList (head --> tail) ");
        Node<V> current = head;
        int eofList = 0;
        while (current != null && size > eofList) {
            System.out.println(current.toString());
            current = current.getNext();
            eofList++;
        }
        System.out.println();
    }

    public void printLinkedListBackward() {
        System.out.println("Printing Doubly LinkedList (tail --> head) ");
        Node<V> current = head;
        int eofList = size;
        while (current != null && eofList > 0) {
            current = current.getPrevious();
            System.out.println(current.toString());
            eofList--;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}
