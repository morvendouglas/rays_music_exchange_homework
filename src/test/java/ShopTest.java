import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.instruments.Guitar;
import shop.instruments.Piano;


import static org.junit.Assert.assertEquals;

public class ShopTest {

    Piano piano;
    Guitar guitar;
    Shop shop;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano("Piano", 50.00, 100.00, "Metallic", "Black", "Percussion", false);
        guitar = new Guitar("Guitar", 10.00, 50.00, "Wood", "Blue", "String", 6);
        shop.addItemToStock(piano);
        shop.addItemToStock(guitar);
    }

    @Test
    public void canAddToStock(){
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.removeItemFromStock(piano);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateTotalProfitInStockList(){
        assertEquals(90.00, shop.calculateProfit(), 00.00);
    }



}
