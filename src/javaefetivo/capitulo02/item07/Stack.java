package javaefetivo.capitulo02.item07;

import java.util.Arrays;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return elements[--size];
    }

    public Object nonLeakingPop() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        Object result = elements[--size];
        elements[size] = null; // Elimine as referências obsoletas
        return result;
    }

    /**
     * Garante espaço para pelo menos mais um elemento, grosseiramente dobrando de capacidade cada
     * vez que o array precisa crescer.
     */
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
