import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMathMethods {

    @Test
    public void testAddTwoNumbers() {
        // Arrange
        int numberOne = 5;
        int numberTwo = 5;

        // Act
        int actualResult = Main.addTwoNumbers(numberOne, numberTwo);

        // Assert
        int expectedResult = 10;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivideTwoNumbers() {
        // Arrange
        int numberOne = 5;
        int numberTwo = 5;

        // Act
        int actualResult = Main.divideTwoNumbers(numberOne, numberTwo);

        // Assert
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtractTwoNumbers() {
        // Arrange
        int numberOne = 5;
        int numberTwo = 5;

        // Act
        int actualResult = Main.subtractTwoNumbers(numberOne, numberTwo);

        // Assert
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyTwoNumbers() {
        // Arrange
        int numberOne = 5;
        int numberTwo = 5;

        // Act
        int actualResult = Main.multiplyTwoNumbers(numberOne, numberTwo);

        // Assert
        int expectedResult = 25;
        assertEquals(expectedResult, actualResult);
    }
}
