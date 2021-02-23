package infnet.basicDataStructure.Queue;

public class Node<V> {
    private V value;
    private Node<V> previous;

    public Node(V value) {
        this.setValue(value);
    }

    public Node<V> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<V> previous) {
        this.previous = previous;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }
}
