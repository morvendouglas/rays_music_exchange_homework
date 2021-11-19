import org.junit.Before;
import org.junit.Test;
import shop.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Drumsticks", 5.00, 10.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Drumsticks", drumSticks.getDescription());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(5.00, drumSticks.getBoughtPrice(), 00.00);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(10.00, drumSticks.getSellPrice(), 00.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5.00, drumSticks.calculateMarkup(), 00.00);
    }
}
