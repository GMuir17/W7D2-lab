import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("wireless", "Logitech");
    }

    @Test
    public void hasType(){
        assertEquals("wireless", mouse.getType());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Logitech", mouse.getManufacturer());
    }
}
