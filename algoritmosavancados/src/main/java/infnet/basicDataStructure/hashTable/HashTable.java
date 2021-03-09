package infnet.basicDataStructure.hashTable;

import java.util.Optional;

public interface HashTable<K, V> {
    void put(K key, V value);

    Optional<V> get(K key);

    void remove(K key);
    
}
