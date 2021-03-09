package infnet.basicDataStructure.hashTable;

public class Pair<K,V> {
    private final K key;
    private final V value;
    private boolean deleted = false;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
