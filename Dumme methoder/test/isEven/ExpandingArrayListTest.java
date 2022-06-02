package isEven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandingArrayListTest {

    @Test
    void isEven() {
        // Arrange
        boolean even;
        boolean uneven;
        long startTime;
        long stopTime;

        // Act
        startTime = System.currentTimeMillis();
        even = ExpandingArrayList.isEven(22111000);
        uneven = ExpandingArrayList.isEven(22111001);
        stopTime = System.currentTimeMillis();
        long ellapsedTime = (stopTime-startTime) / 2;

        // Assert
        System.out.println("Runtime in milliseconds per method: " + ellapsedTime);
        assertTrue(even);
        assertFalse(uneven);
    }
}