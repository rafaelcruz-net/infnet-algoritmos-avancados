package infnet.basicDataStructure.CorrecaoLista.Lista3;

import java.util.Optional;

public class LinkedList<V> {
    private Node<V> head;

    public LinkedList() {
        head = null;
    }

    public void addFront(V item, double weight) {
        this.head = new Node<>(item, weight, head);
    }
    
    public void addAfter(Node<V> aNode, V item, double weight) {
        aNode.setNext(new Node<>(item, weight, aNode.getNext().orElse(null)));
    }

    public void deleteFront() {
        Optional<Node<V>> firstNode = Optional.ofNullable(this.head);
        this.head = firstNode.flatMap(Node::getNext).orElse(null);
        firstNode.ifPresent(n -> {
            n.setValue(null);
            n.setNext(null);  
        });
    }

    public Optional<Node<V>> find(V item) {
        Optional<Node<V>> node = Optional.ofNullable(this.head);
        while (node.filter(n -> n.getValue() != item).isPresent()) {
            node = node.flatMap(Node::getNext);
        }
        return node;
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

    public double getTotalPath() {
        Optional<Node<V>> node = Optional.ofNullable(this.head);
        double result = 0;
        while (node.isPresent()) {
            result += node.get().getWeight();
            node = node.flatMap(Node::getNext);
        }
        return result;
    }

    public Node<V> getMinNode() {
        Optional<Node<V>> node = Optional.ofNullable(this.head);
        Node<V> minNode = this.head;
        while (node.isPresent()) {
            if (node.get().getWeight() < minNode.getWeight()) {
                minNode = node.get();
            }
            node = node.flatMap(Node::getNext);
        }
        return minNode;
    }

    public Node<V> getMaxNode() {
        Optional<Node<V>> node = Optional.ofNullable(this.head);
        Node<V> maxNode = this.head;
        while (node.isPresent()) {
            if (node.get().getWeight() > maxNode.getWeight()) {
                maxNode = node.get();
            }
            node = node.flatMap(Node::getNext);
        }
        return maxNode;
    }
}