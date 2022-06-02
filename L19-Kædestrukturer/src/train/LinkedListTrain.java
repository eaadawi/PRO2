package train;

import java.util.NoSuchElementException;

public class LinkedListTrain
{
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain()
    {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     * 
     * @return the first wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst()
    {
        if (this.firstWagon == null)
        {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     * 
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon)
    {
        if(firstWagon == null) {
            firstWagon = wagon;
        }else {
            wagon.setNextWagon(firstWagon);
            firstWagon = wagon;
        }
    }

    /**
     * Removes the first wagon node in the linked list train.
     * 
     * @return the removed wagon node
     * 
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst()
    {
        if(firstWagon == null) throw new NoSuchElementException();
        WagonNode oldFirst = firstWagon;
        firstWagon = firstWagon.getNextWagon();
        return oldFirst;
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     * 
     * @return the number of wagon nodes
     */
    public int count()
    {
        if(firstWagon == null) return 0;
        int count = 1;
        WagonNode current = firstWagon;
        while (current.getNextWagon() != null) {
            current = current.getNextWagon();
            count++;
        }
        return count;
    }

    /**
     * Removes the given wagon node in the linked list train.
     * 
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     *         <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon)
    {
        boolean found = false;
        if(firstWagon == null) return false;

        WagonNode current = firstWagon;
        while (current.getNextWagon() != null) {
            if(current.getNextWagon() == wagon) {
                found = true;
                break;
            }else {
                current = current.getNextWagon();
            }
        }

        if(!found) return false;

        current.setNextWagon(wagon.getNextWagon());
        return true;

    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     * 
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position)
    {
        if(position == 0) {
            if(firstWagon == null) {
                firstWagon = wagon;
            }else {
                wagon.setNextWagon(firstWagon);
                firstWagon = wagon;
            }
        }

        int count = 1;
        WagonNode current = firstWagon;
        while (current.getNextWagon() != null) {

            if(count == position) {
                wagon.setNextWagon(current.getNextWagon());
                current.setNextWagon(wagon);
                break;
            }

            current = current.getNextWagon();
            count++;
        }

    }
}
