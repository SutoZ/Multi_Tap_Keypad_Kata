import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zolee on 2016. 09. 23..
 */
public class KeypadTest {

    @Test
    public void simpleTest() {
        assertEquals(9, Multi_Tap_Keypad.presses("LOL"));
        assertEquals(13, Multi_Tap_Keypad.presses("HOW R U"));
    }
}
