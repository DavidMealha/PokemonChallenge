package app;

public class InputValidator {

    /**
     *
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
     *
     * @param movement
     * @return
     */
    private static boolean isMovementValid(char movement) {
        if (movement == MOVEMENT_SYMBOL.NORTH || movement == MOVEMENT_SYMBOL.EAST ||
                movement == MOVEMENT_SYMBOL.SOUTH || movement == MOVEMENT_SYMBOL.WEST) {
            return true;
        }
        return false;
    }
}


