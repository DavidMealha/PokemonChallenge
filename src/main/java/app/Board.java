package app;

import java.util.HashSet;

public class Board {

    private HashSet<String> collisions;
    private Position currentPosition;

    public Board() {
        collisions      = new HashSet<String>();
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
        boolean hasKey = collisions.contains(currentPosition.getKey());

        if (!hasKey) {
            addCollision();
        }
    }

    private void addCollision() {
        collisions.add(currentPosition.getKey());
    }

    public int getCollisionsSize() {
        return collisions.size();
    }
}
