package opg5;

public interface Bag extends Subject{
    /** Add a String to the bag */
    void add(String s);
    /** Remove a String from the bag */
    void remove(String s);
    /** Get the count of Strings equal to s in the bag */
    int getCount(String s);
}
