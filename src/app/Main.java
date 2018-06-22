package app;

public class Main {

    public static void main(String[] args) {
        String movements = "";

        try {
            movements = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Missing argument!");
            System.exit(0);
        }

        new PokemonApplication()
                .Start(movements);
    }
}
