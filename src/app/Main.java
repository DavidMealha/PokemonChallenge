package app;

public class Main {

    public static void main(String[] args) {
        String movements = "";
        long startTime = System.currentTimeMillis();

        try {
            movements = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Missing argument!");
            System.exit(0);
        }

        if (InputValidator.validateMovements(movements)) {
            new PokemonApplication()
                    .Start(movements);
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time => " + elapsedTime + " ms.");
    }
}
