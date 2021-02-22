package infnet.basicDataStructure.CorrecaoLista.Lista4;

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

        Node findNode = myLinkedlist.findNode(1);
        System.out.println(findNode);
         
        Node findNode2 = myLinkedlist.findNode(10);
        System.out.println(findNode2);

        myLinkedlist.delete(6);
        myLinkedlist.printLinkedListForward();

    }
}
