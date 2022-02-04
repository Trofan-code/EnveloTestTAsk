import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArithmeticFunctionsTest {
    ArithmeticFunctions arithmeticFunctions;

    @BeforeEach
    void setUp() {
        arithmeticFunctions = new ArithmeticFunctions();
    }

    @Test
    @DisplayName("Simple power should work")
    void testMultiply() {
        assertEquals(4, arithmeticFunctions.power(2, 2), "Regular power should work");
        assertEquals(3125, arithmeticFunctions.power(5, 5), "Regular power should work");
        assertEquals(27, arithmeticFunctions.power(3, 3), "Regular power should work");
    }

    @Test
    @DisplayName("Simple divide should work")
    void testDivide() {
        assertEquals(3, arithmeticFunctions.divide(9, 3), "Regular divide should work");
        assertEquals(5, arithmeticFunctions.divide(25, 5), "Regular divide should work");
        assertEquals(9, arithmeticFunctions.divide(27, 3), "Regular divide should work");
    }

    @Test
    @DisplayName("Simple factorial should work")
    void testFactorial() {
        assertEquals(362880, arithmeticFunctions.factorial(9), "Regular factorial should work");
        assertEquals(120, arithmeticFunctions.factorial(5), "Regular factorial should work");
        assertEquals(6, arithmeticFunctions.factorial(3), "Regular factorial should work");
    }

}
