package gameInteraction;

public interface IGame {
    
    void showPokemon();
    
    void addPokemon(String figure, String name);
    
    void editPokemon(String figure, String nameExisted, String nameToEdit);
    
    void history();
    
    void attack(String pokemonToAttack, String pokemonToUse);
    
    void players(String player1, String pokemon1Player1, String pokemon2Player1, String name2, String pokemon1Player2, String pokemon2Player2);
    
    boolean alive(String pokemon);
}
