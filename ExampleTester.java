import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ExampleTester {

    private Example example;

    @Before
    public void setUp() {
        example = new Example(3, 5);
    }

    @Test
    public void testFuncA_PosY() {
        int result = example.Function_A(7);
        assertEquals(10, result);
    }

    @Test
    public void testFuncA_NegY() {
        int result = example.Function_A(-4);
        assertEquals(-7, result);
    }

    @Test
    public void testFuncA_ZeroY() {
        int result = example.Function_A(0);
        assertEquals(-3, result);
    }

    @Test
    public void testFuncB_LessThanSix() {
        int result = example.Function_B(4);
        assertEquals(9, result);
    }

    @Test
    public void testFuncB_EqualToSix() {
        int result = example.Function_B(6);
        assertEquals(1, result);
    }

    @Test
    public void testFuncB_GreaterThanSix() {
        int result = example.Function_B(8);
        assertEquals(3, result);
    }
}
