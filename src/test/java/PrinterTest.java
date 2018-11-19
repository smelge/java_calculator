import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;
    @Before
    public void before(){
        printer = new Printer(50,100);
    }

    @Test
    public void print(){
        assertEquals(10,printer.print(4,10));
    }

    @Test
    public void tonerLevel(){
        printer.print(4,10);
        assertEquals(60,printer.tonerLevel());
    }

    @Test
    public void refillPaper(){
        assertEquals(120,printer.refillPaper(70));
    }

    @Test
    public void refillToner(){
        assertEquals(100,printer.refillToner());
    }

}
