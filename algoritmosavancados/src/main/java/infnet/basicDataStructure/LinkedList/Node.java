package infnet.basicDataStructure.LinkedList;

import java.util.Optional;

public class Node<V> {
    private V value;
    private Node<V> next;

    public Node(V value, Node<V> next) {
        this.value = value;
        this.next = next;
    }

    public Optional<Node<V>> getNext() {
        return Optional.ofNullable(next);
    }

    public V getValue() {
        return value;
    }

    public Node setValue(V value) {
        this.value = value;
        return this;
    }

    public Node setNext(Node<V> next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" + "value=" + value + '}';
    }
}
