package app;

public class InputValidator {

    /**
     * Responsible to verify if all the movements are valid
     * @param input
     * @return
     */
    public static boolean validateMovements(String input) {
        for (char c : input.toCharArray()) {
            if (isMovementInvalid(c)) {
                return false;
            }
        }
        return true;
    }

    public static String toUpperCase(String movements) {
        return movements.toUpperCase();
    }

    /**
     * Checks if a char represents a valid movement.
     * @param movement
     * @return
     */
    private static boolean isMovementInvalid(char movement) {
        if (movement == Movement.NORTH || movement == Movement.EAST ||
                movement == Movement.SOUTH || movement == Movement.WEST) {
            return false;
        }
        return true;
    }
}


