package infnet.basicDataStructure.Queue;

public class Exec {
    
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();

        queue.enqueue("Nome1");
        queue.enqueue("Nome2");
        queue.enqueue("Nome3");
        queue.enqueue("Nome4");


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        QueueNode<String> queueNode = new QueueNode<String>();
        queueNode.enqueue("Nome1");
        queueNode.enqueue("Nome2");
        queueNode.enqueue("Nome3");
        queueNode.enqueue("Nome4");
        queueNode.enqueue("Nome5");
        queueNode.enqueue("Nome6");

        System.out.println(queueNode.dequeue());
        System.out.println(queueNode.dequeue());
        System.out.println(queueNode.dequeue());
        System.out.println(queueNode.dequeue());
        System.out.println(queueNode.dequeue());
        System.out.println(queueNode.dequeue());
    }


}
