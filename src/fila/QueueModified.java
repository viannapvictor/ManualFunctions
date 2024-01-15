package fila;

import java.util.LinkedList;

public class QueueModified {
    private LinkedList<Integer> queue;

    public QueueModified() {
        this.queue = new LinkedList<Integer>();
    }

    public void enqueue(int value) {
        queue.addLast(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return queue.removeFirst();
    }

    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return queue.getLast();
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return queue.getFirst();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
