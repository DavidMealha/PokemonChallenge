package app;

import java.util.HashMap;

public class Board {

    private HashMap<String, Boolean> collisions;
    private int counter;
    private Position currentPosition;

    public Board() {
        counter         = 0;
        collisions      = new HashMap<String, Boolean>();
        currentPosition = new Position(0, 0);
        incrementPosition();
    }

    public void move(char movement) {
        if (movement == Movement.NORTH) {
            currentPosition.moveNorth();
        } else if (movement == Movement.SOUTH) {
            currentPosition.moveSouth();
        } else if (movement == Movement.EAST) {
            currentPosition.moveEast();
        } else if (movement == Movement.SOUTH) {
            currentPosition.moveWest();
        }

        verifyPosition();
    }

    private void verifyPosition() {
        collisions.put(currentPosition.getKey(), true);
        //Boolean value = collisions.get(currentPosition.getKey());

        // if (value == null) {
        //    incrementPosition();
        //}
    }

    private void incrementPosition() {
        collisions.put(currentPosition.getKey(), true);
        counter++;
    }

    public int mergeCollisions() {
        return collisions.size();
    }

    public int getCounter() {
        return counter;
    }
}
