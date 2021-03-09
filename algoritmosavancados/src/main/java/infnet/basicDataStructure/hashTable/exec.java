package infnet.basicDataStructure.hashTable;

public class exec {
    public static void main(String[] args) {
        OpenAddressHashTable<Integer, String> hashTable = new OpenAddressHashTable<>(50, new ReminderHash<Integer>());

         for (int i = 0; i < 50; i++) {
             hashTable.put(i, "ITEM " + i);
        }
        
        System.out.println(hashTable.get(12));
        System.out.println(hashTable.get(22));
        System.out.println(hashTable.get(32));
        System.out.println(hashTable.get(11));
        System.out.println(hashTable.get(21));
        System.out.println(hashTable.get(31));
        System.out.println(hashTable.get(42));
        System.out.println(hashTable.get(45));
        hashTable.remove(31);
        System.out.println(hashTable.get(31));
    }
}
