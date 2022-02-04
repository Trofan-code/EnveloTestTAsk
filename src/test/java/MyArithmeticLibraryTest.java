import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArithmeticLibraryTest {
    MyArithmeticLibrary myArithmeticLibrary;
    @BeforeEach
    void setUp() {
        myArithmeticLibrary = new MyArithmeticLibrary();
    }
    @Test
    @DisplayName("Simple sum should work")
    void testSum() {
        assertEquals(110, myArithmeticLibrary.sum(100, 10), "Regular sum should work");
        assertEquals(5, myArithmeticLibrary.sum(0, 5), "Regular sum should work");
        assertEquals(0, myArithmeticLibrary.sum(-7, 7), "Regular sum should work");
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        assertEquals(20, myArithmeticLibrary.multiply(4, 5), "Regular multiplication should work");
        assertEquals(25, myArithmeticLibrary.multiply(5, 5), "Regular multiplication should work");
        assertEquals(49, myArithmeticLibrary.multiply(7, 7), "Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, myArithmeticLibrary.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, myArithmeticLibrary.multiply(5, 0), "Multiple with zero should be zero");
    }
    @Test
    @DisplayName("Simple subtraction should work")
    void testSubtract() {
        assertEquals(90, myArithmeticLibrary.subtract(100, 10), "Regular subtraction should work");
        assertEquals(-5, myArithmeticLibrary.subtract(0, 5), "Regular subtraction should work");
        assertEquals(0, myArithmeticLibrary.subtract(7, 7), "Regular subtraction should work");
    }
}
