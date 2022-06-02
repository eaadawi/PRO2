package deque;

import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI{

    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    public CircularArrayDeque(int size)
    {
        elements = new Object[size];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public void addFirst(Object element) {
        growIfNecessary();
        if(isEmpty()) {
            tail = 1;
        }else if(head == 0) {
            head = elements.length-1;
        }else {
            head = head - 1;
        }
        elements[head] = element;
        currentSize++;
    }

    @Override
    public void addLast(Object element) {
        growIfNecessary();
        currentSize++;
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    @Override
    public Object removeFirst() {
        if (currentSize == 0) throw new NoSuchElementException();
        Object removed = elements[head];
        head = (head + 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public Object removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if(tail == 0) {
            tail = elements.length-1;
        }else {
            tail--;
        }
        Object removed = elements[tail];
        currentSize--;
        return removed;
    }

    @Override
    public Object getFirst() {
        return elements[head];
    }

    @Override
    public Object getLast() {
        if(tail == 0) return null;
        return elements[tail-1];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    private void growIfNecessary()
    {
        if (currentSize == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }

}
