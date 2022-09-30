import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {
    @Test
    void nextInt() {
        assertEquals(Task3.nextOdd.apply(12),13);
        assertEquals(Task3.nextOdd.apply(51),53);
        assertEquals(Task3.nextOdd.apply(-10),-9);
        assertEquals(Task3.nextOdd.apply(-21),-19);
        assertEquals(Task3.nextOdd.apply(0),1);
    }
}