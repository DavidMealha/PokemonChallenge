import org.junit.Test;
import app.*;

import static org.junit.Assert.*;

public class PositionTest {

    @Test
    public void incrementNorth() {
        Position p = new Position(0, 0);
        p.moveNorth();

        assertEquals(1, p.getY());
    }

    @Test
    public void incrementSouth() {
        Position p = new Position(0, 0);
        p.moveSouth();

        assertEquals(-1, p.getY());
    }

    @Test
    public void incrementEast() {
        Position p = new Position(0, 0);
        p.moveWest();

        assertEquals(-1, p.getX());
    }

    @Test
    public void incrementWest() {
        Position p = new Position(0, 0);
        p.moveEast();

        assertEquals(1, p.getX());
    }
}
