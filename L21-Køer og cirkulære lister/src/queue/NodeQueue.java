package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    private Node head;
    private Node tail;
    private int size;
    /**
     * Constructs an empty queue.
     */
    public NodeQueue()
    {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(Object element)
    {
        Node node = new Node();
        node.data = element;
        if(head == null) {
            head = node;
            head.next = node;
        }else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    @Override
    public Object dequeue()
    {
        if(head == null) throw new NoSuchElementException();
        Node node = head;
        if(head == tail) {
            tail = null;
            head.next = null;
        }
        head = head.next;
        size--;
        return node.data;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    class Node
    {
        public Object data;
        public Node next;
    }
}
