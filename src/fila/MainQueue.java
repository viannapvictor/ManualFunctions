package fila;

public class MainQueue {

    public static void main(String[] args) {
        QueueModified fila = new QueueModified();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println("Frente da Fila: " + fila.front());
        System.out.println("Fim da Fila: " + fila.rear());
        System.out.println("Tamanho da Fila: " + fila.size());

        System.out.println("Removido da Fila: " + fila.dequeue());

        System.out.println("Frente da Fila após remoção: " + fila.front());
        System.out.println("Tamanho da Fila após remoção: " + fila.size());
        System.out.println("A Fila está vazia? " + fila.isEmpty());
    }
}
