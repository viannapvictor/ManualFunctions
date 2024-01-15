package Pilha;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StackModified {

    private ArrayList<Integer> items;

    public StackModified() {
        this.items = new ArrayList<>();
    }

    public void push(int value) {
        this.items.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        int valorRemovido = this.items.remove(this.items.size() - 1);
        return valorRemovido;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        }
        return this.items.get(this.items.size() - 1);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public int size() {
        return this.items.size();
    }

}