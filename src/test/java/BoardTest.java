import app.Board;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    @Test
    public void testZeroMovements() {
        Board b = new Board();

        assertEquals(1, b.getCollisionsSize());
    }

    @Test
    public void testNorthMovement() {
        Board b = new Board();
        b.move('N');

        assertEquals(2, b.getCollisionsSize());
    }

    @Test
    public void testSouthMovement() {
        Board b = new Board();
        b.move('S');

        assertEquals(2, b.getCollisionsSize());
    }

    @Test
    public void testEastMovement() {
        Board b = new Board();
        b.move('E');

        assertEquals(2, b.getCollisionsSize());
    }

    @Test
    public void testWestMovement() {
        Board b = new Board();
        b.move('O');

        assertEquals(2, b.getCollisionsSize());
    }

    @Test
    public void testOnceAllMovements() {
        Board b = new Board();

        String movements = "NESO";

        for(char c : movements.toCharArray()) {
            b.move(c);
        }

        assertEquals(4, b.getCollisionsSize());
    }

    @Test
    public void testRepeatedPosition() {
        Board b = new Board();

        String movements = "NSNSNSNS";

        for(char c : movements.toCharArray()) {
            b.move(c);
        }

        assertEquals(2, b.getCollisionsSize());
    }
}
