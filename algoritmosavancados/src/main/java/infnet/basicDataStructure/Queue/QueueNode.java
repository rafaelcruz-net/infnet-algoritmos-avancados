package infnet.basicDataStructure.Queue;

public class QueueNode<V> {
    private Node<V> head;
    private int size = 0;

    public void enqueue(V data) {
        Node<V> newNode = new Node<V>(data);
        if (head == null) {
            head = newNode;
            head.setPrevious(head);
            size++;
            return;
        }

        Node<V> temp = head;
        for (int i = 0; i < size; i++) {
            temp = temp.getPrevious();
        }

        temp.setPrevious(newNode);
        newNode.setPrevious(newNode);

        size++; 
    }
    
    public Node<V> dequeue() {
        Node<V> temp = head;

        head = head.getPrevious();
        temp.setPrevious(null);

        size--;
        
        if (size == 0) 
            head = null;
            
        return temp;
    }

    public int getSize() {
        return size;
    }
}
