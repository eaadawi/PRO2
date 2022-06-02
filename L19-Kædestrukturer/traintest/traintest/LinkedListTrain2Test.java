package traintest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import train.LinkedListTrain2;
import train.WagonNode;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTrain2Test {
    private WagonNode locomotive;

    private WagonNode wagon1;
    private WagonNode wagon2;
    private WagonNode wagon3;
    private WagonNode wagon4;
    private WagonNode wagon5;

    @BeforeEach
    void setUp() throws Exception
    {
        this.locomotive = new WagonNode("Locomotive");

        this.wagon1 = new WagonNode("Passenger carriage");
        this.wagon2 = new WagonNode("Platform wagon");
        this.wagon3 = new WagonNode("Centerbeam");
        this.wagon4 = new WagonNode("Autorack");
        this.wagon5 = new WagonNode("Hopper");
    }

    @Test
    void test_linkedListTrain2_canAddLastWagon() {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain2 train = new LinkedListTrain2();

        // --------------------------------------------------
        // ACT
        // --------------------------------------------------

        train.addLast(locomotive);
        train.addLast(wagon1);
        train.addLast(wagon2);
        train.addLast(wagon3);
        train.addLast(wagon4);
        train.addLast(wagon5);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        WagonNode wagonSelected = train.getLast();
        assertEquals(wagon5, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon4, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon3, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon2, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(wagon1, wagonSelected);

        wagonSelected = wagonSelected.getPreviousWagon();
        assertEquals(locomotive, wagonSelected);
    }
}