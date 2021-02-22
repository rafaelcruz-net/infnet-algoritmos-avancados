package infnet.basicDataStructure.CorrecaoLista.Lista4;

public class ExecCircular {
    
    public static void main(String[] args) {
        CircularDoublyList<Integer> myLinkedlist = new CircularDoublyList<Integer>();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(8);

        myLinkedlist.printLinkedListForward();
        myLinkedlist.printLinkedListBackward();

        myLinkedlist.deleteFirst();
        myLinkedlist.printLinkedListForward();

        myLinkedlist.deleteLast();
        myLinkedlist.printLinkedListForward();

        Node findNode = myLinkedlist.findNode(7);
        System.out.println(findNode);
    }
}
