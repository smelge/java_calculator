import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(10,5);
    }


    @Test
    public void add(){
        assertEquals(15,calculator.add(),0.01);
    }

    @Test
    public void subtract(){
        assertEquals(5,calculator.subtract(),0.01);
    }

    @Test
    public void multiply(){
        assertEquals(50,calculator.multiply(),0.01);
    }

    @Test
    public void divide(){
        assertEquals(2,calculator.divide(),0.01);
    }
}
