package infnet.basicDataStructure.DoublyLinkedList;

public class Exec {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> myLinkedlist = new DoublyLinkedList<Integer>();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(2);

        myLinkedlist.printLinkedListForward();
        myLinkedlist.printLinkedListBackward();

        myLinkedlist.deleteLast();
        myLinkedlist.printLinkedListForward();

    }
}
