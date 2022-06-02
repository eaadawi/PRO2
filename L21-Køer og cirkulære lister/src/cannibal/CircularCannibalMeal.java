package cannibal;

import java.util.NoSuchElementException;
import java.util.Random;

public class CircularCannibalMeal {

    private Node pointer;

    public CircularCannibalMeal() {
        this.pointer = null;
    }

    /**
     * Adds person to the cannibal dance meal
     */
    public void addPerson(Person p) {
        Node node = new Node();
        node.data = p;
        if (pointer == null) {
            node.next = node;
        } else {
            node.next = pointer;
            Node current = pointer;
            while (current.next != pointer) {
                current = current.next;
            }
            current.next = node;
        }
        pointer = node;
    }

    /**
     * Removes random person from the cannibal dance
     */
    public Person eatRandomPerson() {
        if (pointer == null) throw new NoSuchElementException();
        Random rand = new Random();
        int randInt = rand.nextInt(10);
        Node node = pointer;
        if (pointer.next == pointer) {
            pointer = null;
            return node.data;
        }
        for (int i = 0; i < randInt; i++) {
            node = node.next;
        }
        return eat(node);
    }

    /**
     * Removes person "count" places from the last eaten
     */
    public Person eatNextPerson(int count) {
        if (pointer == null) throw new NoSuchElementException();
        Node node = pointer;
        if (pointer.next == pointer) {
            pointer = null;
            return node.data;
        }
        for (int i = 1; i < count; i++) {
            node = node.next;
        }
        return eat(node);
    }

    /**
     * Prints all persons waiting to be served
     */
    public void printPersons() {
        if (pointer != null) {
            Node current = pointer;
            while (true) {
                System.out.println(current.data);
                if (current.next == pointer) break;
                current = current.next;
            }
        }
    }

    private Person eat(Node node) {
        if (node.next == null) throw new NoSuchElementException();
        Node current = node;
        while (current.next != node) {
            current = current.next;
        }
        current.next = node.next;
        pointer = node.next;
        return node.data;
    }

    class Node {
        public Person data;
        public Node next;
    }
}
