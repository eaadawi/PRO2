package hashsetstudent;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
    private final Object[] buckets;
    private int currentSize;
    private static final String DELETED = "DELETED";

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSetLinearProbing(int bucketsLength) {
        buckets = new Object[bucketsLength];
        currentSize = 0;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        int h = hashValue(x);
        Object current = buckets[h];
        boolean found = false;
        while (!found && current != null) {
            if (current.equals(x) && current != DELETED) {
                found = true;
            } else {
                h = (h + 1) % buckets.length;
                current = buckets[h];
            }
        }
        return found;
    }

    /**
     * Adds an element to this set.
     *
     * @param x an object
     * @return true if x is a new object, false if x was already in the set
     */
    public boolean add(Object x) {
        int h = hashValue(x);
        boolean found = contains(x);
        if (!found) {
            while (buckets[h] != null || buckets[h] == DELETED) {
                h = (h + 1) % buckets.length;
            }
            buckets[h] = x;
            currentSize++;
        }
        return !found;
    }

    /**
     * Removes an object from this set.
     *
     * @param x an object
     * @return true if x was removed from this set, false if x was not an
     * element of this set
     */
    public boolean remove(Object x) {
        int h = hashValue(x);
        Object current = buckets[h];
        boolean found = false;
        while (!found && current != null) {
            if (current.equals(x) && current != DELETED) {
                buckets[h] = DELETED;
                currentSize--;
                found = true;
            } else {
                h = (h + 1) % buckets.length;
                current = buckets[h];
            }
        }
        return found;
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size() {
        return currentSize;
    }

    private int hashValue(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;
        return h;
    }

    // method only for test purpose
    public void writeOut() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println(i + "\t" + buckets[i]);
        }
    }

}
