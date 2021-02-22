package infnet.basicDataStructure.CorrecaoLista.Lista4;

import java.util.Objects;

public class Node<V> {
    private V value;
    private Node<V> next;
    private Node<V> previous;

    public Node(V value) {
        this.setValue(value);
    }

    public Node<V> getNext() {
        return next;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<V> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<V> previous) {
        this.previous = previous;
    }

    public void setNext(Node<V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
