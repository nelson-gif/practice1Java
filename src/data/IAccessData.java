package data;
import domain.Player;
import domain.Pokemon;

public interface IAccessData {
    
    void addPokemon(String figure, String nombre);
    
    boolean exist(String name);
    
    String editPokemon(String figure, String nombre);
    
    //(pokemon that the user wants to attack, pokemon that the user wants to use to attack)
    void batallar(String pokemonToAttack, String pokemonToUse);
    
    boolean alive(String pokemon);
    
    int getLife(String pokemon);
    
    void listPokemon();
    
    void players(String name, String pokemon1, String pokemon2);
}
