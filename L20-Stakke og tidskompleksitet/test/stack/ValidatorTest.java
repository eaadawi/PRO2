package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void test_validator_canValidateBrackets() {
        // Arrange
        String str1 = "(3+{5{99{*}}[23[{67}67]]})";
        String str2 = "(}){";

        // Act
        boolean res1 = Validator.validateBrackets(str1);
        boolean res2 = Validator.validateBrackets(str2);

        // Assert
        assertTrue(res1);
        assertFalse(res2);
    }
}