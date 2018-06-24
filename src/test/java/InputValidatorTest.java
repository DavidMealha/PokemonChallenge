import app.InputValidator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputValidatorTest {

    @Test
    public void testMovementWithNumber() {
        boolean result = InputValidator.validateMovements("NSNS0");

        assertEquals(false, result);
    }

    @Test
    public void testMovementWithSpaces() {
        boolean result = InputValidator.validateMovements("NS    N  S");

        assertEquals(false, result);
    }
}
