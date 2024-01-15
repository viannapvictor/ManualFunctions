package Pilha;

public class MainPilha {
    public static void main(String[] args) {
        StackModified pilha = new StackModified();

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da pilha: " + pilha.size());

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Elemento no topo: " + pilha.top());

        System.out.println("Removendo o elemento do topo: " + pilha.pop());
        System.out.println("Elemento no topo agora: " + pilha.top());

    }
}
