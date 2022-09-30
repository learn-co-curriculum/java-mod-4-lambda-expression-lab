import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void isEven() {
        assertTrue(Task2.isEven.test(12));
        assertTrue(Task2.isEven.test(-4));
        assertTrue(Task2.isEven.test(0));
        assertFalse(Task2.isEven.test(49));
        assertFalse(Task2.isEven.test(-5));
    }
}