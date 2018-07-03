import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard("wireless", "Logitech");
    }

    @Test
    public void hasType(){
        assertEquals("wireless", keyboard.getType());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Logitech", keyboard.getManufacturer());
    }
}
