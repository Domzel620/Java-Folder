


public class TestPokemon {
    public static void main(String[] args) {
        Charmander steve = new Charmander();
        steve.getHp();

        Stadium battlefield = new Stadium();

        Pikachu paul = new Pikachu();
        paul.getHp();
        battlefield.battle(steve, paul);
    }
}
