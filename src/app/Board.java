package app;

import java.util.HashMap;

public class Board {

    private HashMap<String, Boolean> collisions;
    private Position currentPosition;

    public Board() {
        collisions      = new HashMap<String, Boolean>();
        currentPosition = new Position(0, 0);
        addCollision();
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
        Boolean value = collisions.get(currentPosition.getKey());

        if (value == null) {
            addCollision();
        }
    }

    private void addCollision() {
        collisions.put(currentPosition.getKey(), true);
    }

    public int getCollisionsSize() {
        return collisions.size();
    }
}
