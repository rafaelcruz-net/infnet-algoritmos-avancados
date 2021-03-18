package infnet.basicDataStructure.BinaryTree;

import java.util.Optional;

import javax.lang.model.util.ElementScanner6;

public class BinaryTree<K, V> {
    
    protected BinaryTreeNode<K, V> root;

    public void put(K key, V value) {
        if (root == null)
            this.root = new BinaryTreeNode<>(key, value);
        else
            put(key, value, root);
    }

    private void put(K key, V value, BinaryTreeNode<K, V> node) {
        if (key == node.getKey()) {
            node.setKey(key);
            node.setValue(value);
        } else if (((Comparable) key).compareTo(node.getKey()) < 0) {
            if (node.getLeft() != null)
                put(key, value, node.getLeft());
            else
                node.setLeft(new BinaryTreeNode<>(key, value));
        } else if (((Comparable) key).compareTo(node.getKey()) > 0) {
            if (node.getRight() != null)
                put(key, value, node.getRight());
            else
                node.setRight(new BinaryTreeNode<>(key, value));
        }
    }
    
    public V get(K key) {
        return this.get(key, root);
    }

    private V get(K key, BinaryTreeNode<K, V> node) {
        if (((Comparable) key).compareTo(node.getKey()) == 0)
            return node.getValue();
        else if (((Comparable) key).compareTo(node.getKey()) < 0)
            return get(key, node.getLeft());
        else
            return get(key, node.getRight());
    }

    public BinaryTreeNode<K, V> minKey() {
        if (root == null)
            return null;

        return this.minKey(root);
    }
    
    private BinaryTreeNode<K, V> minKey(BinaryTreeNode<K, V> node) {
        BinaryTreeNode<K, V> tempNode = node;

        while (tempNode != null && tempNode.getLeft() != null)
            tempNode = tempNode.getLeft();

        return tempNode;
    }
    
    public BinaryTreeNode<K, V> maxKey() {
        if (root == null)
            return null;
        return this.maxKey(root);
    }

    private BinaryTreeNode<K, V> maxKey(BinaryTreeNode<K, V> node) {
        BinaryTreeNode<K, V> tempNode = node;

        while (tempNode != null && tempNode.getRight() != null)
            tempNode = tempNode.getRight();

        return tempNode;
    }

    public void print() {
        Optional.ofNullable(root).ifPresent(this::print);
    }
    
    private void print(BinaryTreeNode<K, V> node) {
        Optional.ofNullable(node.getLeft()).ifPresent(this::print);
        System.out.println("INORDER " + node.getKey());
        Optional.ofNullable(node.getRight()).ifPresent(this::print);
    }

    public static void main(String[] args) {
        BinaryTree<Integer, String> binaryTree = new BinaryTree<Integer, String>();
        System.out.println(binaryTree.minKey());
        binaryTree.put(10, "Isabel");
        binaryTree.put(5, "John");
        binaryTree.put(4, "Ruth");
        binaryTree.put(66, "Sarah");
        binaryTree.put(98, "Peter");
        binaryTree.put(7, "Tom");

        System.out.println(binaryTree.get(10));
        System.out.println(binaryTree.get(5));
        System.out.println(binaryTree.get(4));
        System.out.println(binaryTree.get(66));
        System.out.println(binaryTree.get(98));
        System.out.println(binaryTree.get(7));

        binaryTree.put(124578, "Sam");

        System.out.println(binaryTree.get(124578));
        System.out.println(binaryTree.minKey().getKey());
        System.out.println(binaryTree.maxKey().getKey());

        binaryTree.print();
    }

}
