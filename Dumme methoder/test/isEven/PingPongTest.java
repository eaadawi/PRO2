package isEven;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PingPongTest {

    @Test
    void isEven() {
        // Arrange
        boolean even;
        boolean uneven;
        long startTime;
        long stopTime;

        // Act
        startTime = System.currentTimeMillis();
        even = PingPong.isEven(9990);
        uneven = PingPong.isEven(9991);
        stopTime = System.currentTimeMillis();
        long ellapsedTime = (stopTime-startTime) / 2;

        // Assert
        System.out.println("Runtime in milliseconds per method: " + ellapsedTime);
        assertTrue(even);
        assertFalse(uneven);
    }
}