import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterbottleTest {
    private Waterbottle waterbottle;
    @Before
    public void before(){
        waterbottle = new Waterbottle();
    }

    @Test
    public void drink(){
        assertEquals(90,waterbottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0,waterbottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100,waterbottle.fill());
    }
}
