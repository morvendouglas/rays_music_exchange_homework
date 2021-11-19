import org.junit.Before;
import org.junit.Test;
import shop.instruments.Piano;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Piano", 50.00, 100.00, "Metallic", "Black", "Percussion", false);
    }

    @Test
    public void hasDescription(){
        assertEquals("Piano", piano.getDescription());
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(50.00, piano.getBoughtPrice(), 00.00);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100.00, piano.getSellPrice(), 00.00);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Metallic", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Percussion", piano.getType());
    }

    @Test
    public void canCheckIfPianoIsGrandPiano(){
        assertEquals(false, piano.getGrandPiano());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50.00, piano.calculateMarkup(), 00.00);
    }

    @Test
    public void canPlay(){
        assertEquals("La de da...", piano.play());
    }

}
