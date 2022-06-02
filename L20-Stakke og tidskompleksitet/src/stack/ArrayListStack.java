package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListStack implements StackI{
    private List<Object> stack;
    private int top;

    public ArrayListStack() {
        top = -1;
        stack = new ArrayList<>();
    }

    @Override
    public void push(Object element) {
        top++;
        stack.add(element);
    }

    @Override
    public Object pop() {
        if(top < 0) throw new NoSuchElementException();
        Object element = stack.get(top);
        stack.remove(top);
        top--;
        return element;
    }

    @Override
    public Object peek() {
        if(top < 0) throw new NoSuchElementException();
        return stack.get(top);
    }

    @Override
    public int size() {
        return top+1;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }
}
