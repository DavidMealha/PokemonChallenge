package app;

public class PokemonApplication {

    public void Start(String movements) {
        InputValidator.validateMovements(movements);
    }
}
