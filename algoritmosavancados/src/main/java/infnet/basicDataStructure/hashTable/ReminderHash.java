package infnet.basicDataStructure.hashTable;

public class ReminderHash<K> implements HashProvider<K> {

    public ReminderHash() {
        super();
    }

    @Override
    public int hashKey(K key, int tableSize) {
        // h(k) = k mod n
        return (int) (key.hashCode() % tableSize);
    }
    
}
