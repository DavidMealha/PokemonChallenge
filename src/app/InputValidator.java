package app;

public class InputValidator {

    /**
     * Responsible to verify is all the movements are valid
     * @param input
     * @return
     */
    public static boolean validateMovements(String input) {
        for (char c : input.toCharArray()) {
            if (!isMovementValid(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if a char represents a valid movement.
     * @param movement
     * @return
     */
    private static boolean isMovementValid(char movement) {
        if (movement == Movement.NORTH || movement == Movement.EAST ||
                movement == Movement.SOUTH || movement == Movement.WEST) {
            return true;
        }
        return false;
    }
}


