package infnet.basicDataStructure.hashTable;

public interface HashProvider<K> {
    int hashKey(K key, int tableSize);
}
