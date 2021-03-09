package infnet.basicDataStructure.hashTable;

import java.util.Optional;

public class OpenAddressHashTable<K, V> implements HashTable<K, V> {

    private HashProvider<K> hashProvider;
    private Pair<K, V>[] array;

    public OpenAddressHashTable(int capacity, HashProvider<K> hashProvider) {
        super();
        this.array = new Pair[capacity];
        this.hashProvider = hashProvider; 
    }

    @Override
    public void put(K key, V value) {
        
        int s = array.length;
        int hashValue = hashProvider.hashKey(key, s);
        int i = 0;
        while (i < s && array[(hashValue + i) % s] != null && !array[(hashValue + i) % s].isDeleted())
            i++;
        
        if (i < s)
            array[(hashValue + i) % s] = new Pair<>(key, value);
    }

    public Optional<V> get(K key) {
        return Optional.ofNullable(array[searchPosition(key)]).filter(kv -> !kv.isDeleted())
                .filter(kv -> kv.getKey().equals(key)).map(Pair::getValue);
    }

    public void remove(K key) {
        Optional.ofNullable(array[searchPosition(key)]).ifPresent(kv -> kv.setDeleted(true));
    }


    private int searchPosition(K key) {
        int s = array.length;
        int hashValue = hashProvider.hashKey(key, s);
        int i = 0;
        while (i < s && array[(hashValue + i) % s] != null && !array[(hashValue + i) % s].getKey().equals(key))
            i++;
        return (hashValue + i) % s;
    }
    
}
