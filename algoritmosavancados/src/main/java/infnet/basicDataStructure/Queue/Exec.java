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


    }


}
