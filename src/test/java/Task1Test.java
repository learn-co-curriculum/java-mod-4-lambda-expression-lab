import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void nextInt() {
        assertEquals(Task1.nextInt.apply(12),13);
        assertEquals(Task1.nextInt.apply(51),52);
        assertEquals(Task1.nextInt.apply(-10),-9);
        assertEquals(Task1.nextInt.apply(0),1);
    }
}