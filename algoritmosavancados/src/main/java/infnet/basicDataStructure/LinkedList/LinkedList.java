package infnet.basicDataStructure.LinkedList;

import java.util.Optional;

public class LinkedList<V> {
    private Node<V> head;

    public LinkedList() {
        head = null;
    }

    public void addFront(V item) {
        this.head = new Node<>(item, head);
    }

    public void deleteFront() {
        Optional<Node<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(Node::getNext).orElse(null);
        firstNode.ifPresent(n -> n.setNext(null));
    }

    public Optional<Node<V>> find(V item) {
        Optional<Node<V>> node = Optional.ofNullable(this.head);
        while (node.filter(n -> n.getValue() != item).isPresent()) {
            node = node.flatMap(Node::getNext);
        }
        return node;
    }

    public void addAfter(Node<V> aNode, V item) {
        aNode.setNext(new Node<>(item, aNode.getNext().orElse(null)));
    }

    public String toString() {
        Optional<Node<V>> node = Optional.ofNullable(this.head);
        StringBuffer result = new StringBuffer("[");
        while (node.isPresent()) {
            node.ifPresent(n -> result.append(n.getValue().toString()));
            node = node.flatMap(Node::getNext);
            node.ifPresent(n -> result.append(", "));
        }
        return result.append("]").toString();
    }
}