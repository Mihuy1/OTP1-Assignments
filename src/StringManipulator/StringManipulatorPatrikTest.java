package StringManipulator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorPatrikTest {

    private static StringManipulatorPatrik manipulator;

    @BeforeAll
    public static void setUpClass() {
        manipulator = new StringManipulatorPatrik();
    }

    @AfterAll
    public static void tearDownClass() {
        manipulator = null;
    }

    @Test
    void reverse() {
        assertEquals("teerg", manipulator.reverse("greet"));
    }

    @Test
    void capitalize() {
        assertEquals("Greet", manipulator.capitalize("greet"));
    }
}