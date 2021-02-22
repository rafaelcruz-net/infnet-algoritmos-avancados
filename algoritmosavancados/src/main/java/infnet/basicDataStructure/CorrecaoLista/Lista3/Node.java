package infnet.basicDataStructure.CorrecaoLista.Lista3;

import java.util.Optional;

public class Node<V> {
    private V value;
    private Node<V> next;
    private double weight;

    public Node(V value, double weight, Node<V> next) {
        this.value = value;
        this.next = next;
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
