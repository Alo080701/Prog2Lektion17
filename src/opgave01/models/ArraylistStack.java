package opgave01.models;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArraylistStack<E> implements StackEaaa<E>{
    ArrayList<E> list = new ArrayList<>();

    @Override
    public void push(E element) {
        list.addFirst(element);
    }

    @Override
    public E pop() {
        throwIfEmpty();
        return list.removeFirst();
    }

    @Override
    public E peek() {
        throwIfEmpty();
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }

    private void throwIfEmpty() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
    }
}
