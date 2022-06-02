package queuetest;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import snacks.Limb;
import snackssupply.SnackBar;
import snackssupply.SnackFactory;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
class SnackBarAndFactoryTest
{
    @Test
    @Order(1)
    void test_queue_canEnqueueAndDequeue()
    {
        // Arrange
        Limb limb1 = new Limb(Limb.Types.Finger);
        Limb limb2 = new Limb(Limb.Types.Foot);
        Limb limb3 = new Limb(Limb.Types.Hand);

        limb1.setWeight(20);
        limb2.setWeight(40);
        limb3.setWeight(30);

        Limb[] limbs = {limb1, limb2, limb3};

        SnackBar<Limb> snackBar = new SnackBar<>();

        // Act
        ArrayList<Limb> limbsList = snackBar.sortSnacks(limbs);

        // Assert
        assertEquals(limb1, limbsList.get(0));
        assertEquals(limb3, limbsList.get(1));
        assertEquals(limb2, limbsList.get(2));

    }

    @Test
    @Order(2)
    void test_queue_returnsSize()
    {
        // Arrange
        SnackFactory snackFactory = new SnackFactory();
        Limb[] snackContainer = new Limb[10];

        // ACT & ASSERT
        snackFactory.getNewSnacks(snackContainer);
        for (Limb limb : snackContainer) {
            assertNotNull(limb);
        }
    }

}
