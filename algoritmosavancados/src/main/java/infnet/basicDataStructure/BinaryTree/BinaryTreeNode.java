package infnet.basicDataStructure.BinaryTree;

public class BinaryTreeNode<K, V> {
    private BinaryTreeNode<K, V> left;
    private BinaryTreeNode<K, V> right;
    private K key;
    private V value;

    public BinaryTreeNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public BinaryTreeNode<K, V> getLeft() {
        return left;
    }

    public BinaryTreeNode<K, V> getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode<K, V> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<K, V> right) {
        this.right = right;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
