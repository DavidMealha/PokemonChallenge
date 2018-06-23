package app;

public class PokemonApplication {

    public void Start(String movements) {
        Board b = new Board();

        for (char c : movements.toCharArray()) {
            b.move(c);
        }

        // System.out.println("Total amount of Pokemons => " + b.getCounter());
        System.out.println("Total amount of Pokemons => " + b.mergeCollisions());
    }
}
