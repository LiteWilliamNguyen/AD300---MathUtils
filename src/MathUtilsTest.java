import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5,MathUtils.add(2,3));
        assertEquals(-5,MathUtils.add(2,-7));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(5,MathUtils.subtract(6, 1));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(6,MathUtils.multiply(2,3));
        assertEquals(0, MathUtils.multiply(5,0));
        assertEquals(-5, MathUtils.multiply(1,-5));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2,MathUtils.divide(6,3));
        assertEquals(Double.NaN, MathUtils.divide(6,0));
    }
}