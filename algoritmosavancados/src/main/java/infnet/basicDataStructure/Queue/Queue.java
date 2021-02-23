package infnet.basicDataStructure.Queue;

import java.util.ArrayList;

public class Queue<V> {
    private ArrayList<V> backField;

    public Queue() {
        this.backField = new ArrayList<V>();
    }

    public void enqueue(V data) {
        this.backField.add(data);
    }

    public V dequeue() {
        V item = this.backField.get(0);
        this.backField.remove(0);
        return item;
    }

    public int getSize() {
        return backField.size();
    }
}
