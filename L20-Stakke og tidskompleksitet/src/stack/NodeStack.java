package stack;

import java.util.NoSuchElementException;

public class NodeStack implements StackI{
    private Node firstNode;
    private int size;

    public NodeStack() {
        this.firstNode = null;
        this.size = 0;
    }

    @Override
    public void push(Object element) {
        Node node = new Node();
        node.data = element;
        if(firstNode != null) {
            node.next = firstNode;
        }
        firstNode = node;
        size++;
    }

    @Override
    public Object pop() {
        if(firstNode == null) throw new NoSuchElementException();
        Node node = firstNode;
        firstNode = firstNode.next;
        size--;
        return node.data;
    }

    @Override
    public Object peek() {
        if(firstNode == null) throw new NoSuchElementException();
        return firstNode.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    class Node {
        public Object data;
        public Node next;
    }
}
