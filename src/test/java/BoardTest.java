import app.Board;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void testZeroMovemens() {
        Board b = new Board();
        int nrPokemons = b.getCollisionsSize();

        assertEquals(1, nrPokemons);
    }

}
